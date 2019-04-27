package week2_time_complexity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class TimeComplexity {
    public static void main(String[] args) throws IOException {
        long start, finish;
        double duration = 0.0;

        BufferedWriter DurationWriter = new BufferedWriter(new FileWriter("duration.txt"));
        BufferedWriter comparisonCountWriter = new BufferedWriter(new FileWriter("comparisonCount.txt"));
        int list_size = 1000;
        int comparisonCount =0;

        while (list_size <= 100000) {
            int[] list = new int[list_size];
            list = RandomList(list);
            start = System.currentTimeMillis();
            comparisonCount=SelectionSortTime(list);
            finish = System.currentTimeMillis();
            duration = (finish - start) / 1000.0;
            comparisonCountWriter.write(list_size+"\t"+comparisonCount+"\r\n");
            DurationWriter.write(list_size+"\t"+duration+"\r\n");
            list_size+=2000;


        }
        DurationWriter.close();
        comparisonCountWriter.close();
    }


    public static int[] RandomList(int[] list) {
        int tmp = 0;
        Random random = new Random();

        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        for (int i = 0; i < list.length; i++) {
            int dst = random.nextInt(list.length);
            tmp = list[i];
            list[i] = list[dst];
            list[dst] = tmp;
        }
        return list;
    }


    public static int SelectionSortTime(int[] array) {
        int min;
        int minIndex;
        int comparisonCount = 0;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    comparisonCount++;
                    min = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }
        return comparisonCount;
    }
}
