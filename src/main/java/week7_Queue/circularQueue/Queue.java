package week7_Queue.circularQueue;

interface Queue {
    boolean isEmpty();

    boolean isFull();

    void enQueue(char item);

    char deQueue();

    void delete();

    char peek();
}
