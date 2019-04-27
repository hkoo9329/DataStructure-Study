package circularQueue;

public interface Queue<T> {
    boolean isEnpty();
    boolean isFull();
    //void add(T item);
    T pull();
    T peek();
}
