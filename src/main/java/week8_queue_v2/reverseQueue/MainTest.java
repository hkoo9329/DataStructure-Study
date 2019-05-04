package week8_queue_v2.reverseQueue;

public class MainTest {

    public static void main(String[] args) {
        ArrayCQueue queue = new ArrayCQueue(20);
        for (int i = 0; i < 10; i++) {
            queue.enQueue((char) ('0' + i));
        }
        queue.printQueue();
        queue.reverseQueue();
        queue.printQueue();
    }
}
