package week3_array.RandomLengthSequential;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;


class RandomLengthSequential {
    public static void main(String[] args) {
        int list_size = 1000;
        int count = 0;
        int[] list = new int[list_size];
        list = RandomList(list);
        list = SelectionSortCount(list);
        count = ListInsertDeletetCount(list);
        System.out.println(count);
    }

    public static int[] RandomList(int[] list) {
        int tmp = 0;
        Random rnd = new Random();
        for (int i = 0; i < list.length - 1; i++) {
            list[i] = i;
        }
        for (int i = 0; i < list.length - 1; i++) {
            int dst = rnd.nextInt(list.length - 1);
            tmp = list[i];
            list[i] = list[dst];
            list[dst] = tmp;
        }
        return list;
    }

    public static int[] SelectionSortCount(int[] list) {
        int min;
        int minIndex;
        for (int i = 0; i < list.length - 1; i++) {
            min = list[i];
            minIndex = i;
            for (int j = i + 1; j < list.length - 1; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            list[minIndex] = list[i];
            list[i] = min;
        }
        return list;
    }

    public static int ListInsertDeletetCount(int[] list) {
        int count = 0;
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) { // 100번 반복
            int dst = rnd.nextInt(list.length - 1);
            for (int index = list.length - 1; index > dst; index--) {
                list[index] = list[index - 1];
                count++;
            }
            list[dst] = dst;
            dst = rnd.nextInt(list.length - 1);
            for (int index = dst; index < list.length - 1; index++) {
                list[index] = list[index + 1];
                count++;
            }
            list[list.length - 1] = 0;

        }
        count = count / 200; //삽입/삭제 평균 빈도수 계산
        return count;
    }
}
