package week15_sorting;

public class Sorting {

    public Stud[] bubleSort(Stud a[]) {
        int size = a.length;
        Stud temp;
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j].id > a[j + 1].id) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public Stud[] InsertSort(Stud a[]) {
        int size = a.length;
        int j;
        Stud temp;
        for (int i = 1; i < size; i++) {
            temp = a[i];
            j = i;
            while ((j > 0) && (a[j - 1].id > temp.id)) {

                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
        return a;
    }


    public Stud[] quickSort(Stud[] a, int L, int R){
        int left = L;
        int right = R;
        int pivot = (left+right)/2;

        do {
            while (a[left].id < a[pivot].id)
                left++;
            while (a[right].id > a[pivot].id)
                right--;
            if (left <= right){
                Stud temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }while (left<=right);
        if (L < right)
            quickSort(a,L,right);
        if (R>left)
            quickSort(a,left,R);

        return a;
    }

//    public void quickSort(Stud[] a) {
//        quickSort(a, 0, a.length - 1);
//    }
//
//    public void quickSort(Stud[] a, int begin, int end) {
//
//        if (begin < end) {
//            int p;
//            p = partition(a, begin, end);
//            quickSort(a, begin, p - 1);
//            quickSort(a, p + 1, end);
//
//        }
//    }
//
//    public int partition(Stud a[], int begin, int end) {
//        int pivot, L, R;
//        Stud temp;
//        L = begin;
//        R = end;
//        pivot = (begin + end) / 2;
//
//        while (L < R) {
//            while ((a[L].id < a[pivot].id) && (L < R)) {
//                L++;
//            }
//            while ((a[R].id >= a[pivot].id) && (L < R)) {
//                R--;
//            }
//            if (L < R) {
//                temp = a[L];
//                a[L] = a[R];
//                a[R] = temp;
//            }
//        }
//        temp = a[pivot];
//        a[pivot] = a[R];
//        a[R] = temp;
//
//        return L;
//    }
}
