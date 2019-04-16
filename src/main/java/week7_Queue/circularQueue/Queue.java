package week7_Queue.circularQueue;

public interface Queue {
    boolean isEmpty();
    boolean isFull();
    void enQueue(char item);
    char deQueue();
    void delete();
    char peek();
}
