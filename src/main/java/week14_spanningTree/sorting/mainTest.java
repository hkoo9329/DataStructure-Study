package week14_spanningTree.sorting;

import java.util.Collections;
import java.util.Random;

public class mainTest {
    private static int[] BtT;
    private static int[] Rnd;
    private static int[] TtB;

    public static void main(String[] args) {
        int cnt = 10;
        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        InsertSort insertSort = new InsertSort();

        for (int i = 1000; i <= 10000; i += 1000) {
            arrayInit(i);
            bubbleSort.sort(TtB);
            System.out.println(bubbleSort);
        }


//        arrayInit(cnt);
//        System.out.println("BubbleSort");
//        bubbleSort.sort(BtT);
//        System.out.println("오름차순 : "+bubbleSort);
//        bubbleSort.sort(Rnd);
//        System.out.println("랜덤 : "+bubbleSort);
//        bubbleSort.sort(TtB);
//        System.out.println("내림차순 : "+bubbleSort);
//
//        arrayInit(cnt);
//        System.out.println("QuickSort");
//        quickSort.sort(BtT);
//        System.out.println("오름차순 : "+quickSort);
//        quickSort.sort(Rnd);
//        System.out.println("랜덤 : "+quickSort);
//        quickSort.sort(TtB);
//        System.out.println("내림차순 : "+quickSort);
//
//        arrayInit(cnt);
//        System.out.println("InsertSort");
//        insertSort.sort(BtT,BtT.length);
//        System.out.println("오름차순 : "+insertSort);
//        insertSort.sort(Rnd,Rnd.length);
//        System.out.println("랜덤 : "+insertSort);
//        insertSort.sort(TtB,TtB.length);
//        System.out.println("내림차순 : "+insertSort);

    }

    public static void arrayInit(int cnt) {
        BtT = new int[cnt];
        Rnd = new int[cnt];
        TtB = new int[cnt];

        for (int i = 1; i <= cnt; i++) {
            BtT[i - 1] = i;
            TtB[i - 1] = cnt - i + 1;
            Random random = new Random();
            Rnd[i - 1] = random.nextInt(cnt) + 1;
        }
    }
}
