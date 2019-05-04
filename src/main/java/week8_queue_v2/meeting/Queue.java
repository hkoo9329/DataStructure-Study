package week8_queue_v2.meeting;

interface Queue {
    boolean isEmpty();
    void enQueue(QNode item);
    QNode deQueue();
    void delete();
    QNode peek();
}
