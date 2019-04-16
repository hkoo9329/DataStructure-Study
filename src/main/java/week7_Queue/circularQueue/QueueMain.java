package week7_Queue.circularQueue;

public class QueueMain {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(20);
        for (int i=0;i<10;i++){
            queue.enQueue((char)('0'+i));
        }
        queue.printQueue();
        queue.reverseQueue();
        queue.printQueue();
    }
}
