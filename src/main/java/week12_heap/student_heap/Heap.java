package week12_heap.student_heap;

public class Heap {
    private int heapSize;
    private Stud itemHeap[];

    public Heap() {
        heapSize = 0;
        itemHeap = new Stud[50];
    }

    public void insertHeap(Stud item) {

        if (heapSize == itemHeap.length) {
            System.out.println("heap is full");
        } else {
            int i = ++heapSize;
            while ((i != 1) && (item.id < itemHeap[i / 2].id)) {
                itemHeap[i] = itemHeap[i / 2];
                i /= 2;
            }
            itemHeap[i] = item;
            System.out.println("Insert Item : ["+item+"]");
        }

    }

    public int getHeapSize() {
        return this.heapSize;
    }

    public Stud deleteHeap() {
        int parent, child;
        Stud item, temp;
        item = itemHeap[1];
        temp = itemHeap[heapSize--];
        parent = 1;
        child = 2;

        while (child <= heapSize) {
            if ((child < heapSize) && (itemHeap[child].id > itemHeap[child + 1].id))
                child++;
            if (temp.id <= itemHeap[child].id)
                break;
            itemHeap[parent] = itemHeap[child];
            parent = child;
            child *= 2;
        }
        itemHeap[parent] = temp;
        System.out.println("deleted Item : ["+item+"]");
        return item;

    }

    public void printHeap() {
        System.out.print("Heap >>>  ");
        for (int i = 1; i <= heapSize; i++) {
            System.out.print("["+itemHeap[i]+"] ");
        }
        System.out.println("\n");
    }

}
