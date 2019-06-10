package week14_spanningTree.sorting;

public class QuickSort {
    private int i = 0;
    private int count;

    public int partition(int a[], int begin, int end) {
        int pivot, temp, L, R, t;
        L = begin;
        R = end;
        pivot = (begin + end) / 2;
//        System.out.printf("\n [퀵정렬 %d 단계 : pivot=%d ]\n", ++i, a[pivot]);
        while (L < R) {
            while ((a[L] < a[pivot]) && (L < R)) {
                L++;
            }
            while ((a[R] >= a[pivot]) && (L < R)){
                R--;
            }
            if (L < R) {
                temp = a[L];
                a[L] = a[R];
                a[R] = temp;
            }
            count++;
        }
        temp = a[pivot];
        a[pivot] = a[R];
        a[R] = temp;
        count++;

//        for (t = 0; t < a.length; t++) {
//            System.out.print(" " + a[t]);
//        }
//        System.out.println();

        return L;
    }

    public void sort(int a[]){
        count = 0;
        sort(a, 0,a.length-1);
    }

    public void sort(int a[], int begin, int end) {

        if (begin < end) {
            int p;
            p = partition(a, begin, end);
            sort(a, begin, p - 1);
            sort(a, p + 1, end);

        }
        count++;
    }

    @Override
    public String toString() {
        return "\n연산횟수: " + count + "\n";

    }
}
