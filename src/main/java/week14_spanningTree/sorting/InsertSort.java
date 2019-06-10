package week14_spanningTree.sorting;

public class InsertSort {
    private int count;

    public void sort(int a[], int size) {
        count = 0;
        int temp, j;
        for (int i = 1; i < size; i++) {
            temp = a[i];
            j = i;
            while ((j > 0) && (a[j - 1] > temp)) {

                a[j] = a[j - 1];
                j--;
                count++;
            }
            a[j] = temp;
//            System.out.print("\n 삽입정렬 "+i+" 단계: ");
//            for (int t=0;t<size;t++){
//                System.out.print(" "+a[t]);
//            }
//            System.out.println();
            count++;
        }
    }

    @Override
    public String toString() {
        return "\n연산횟수: " + this.count + "\n";
    }
}
