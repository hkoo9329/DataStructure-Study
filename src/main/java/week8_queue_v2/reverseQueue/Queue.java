package week8_queue_v2.reverseQueue;

interface Queue {
    boolean isEmpty();

    boolean isFull();

    void enQueue(char item);

    char deQueue();

    void delete();

    char peek();
}
