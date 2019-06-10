package week14_spanningTree.sorting;

public class BubbleSort {

    private int  compareCount;
    private int moveCount;

    public void sort(int a[]) {
        int temp, size;
         compareCount=0;
         moveCount = 0;
        size = a.length;
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                compareCount++;
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    moveCount++;
                }
            }
        }
    }
    public int getCompareCount(){
        return this.compareCount;
    }
    public int getMoveCount(){
        return this.moveCount;
    }

    public String toString(){
        return  "\n비교연산: "+compareCount+"\n"
                +"이동 : "+moveCount+"\n"
                +"총 연산 : "+(compareCount+moveCount)+"\n";
    }
}
