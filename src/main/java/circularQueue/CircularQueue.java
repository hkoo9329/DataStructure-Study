package circularQueue;



public class CircularQueue<T> implements Queue{
    private int front;
    private int rear;
    private int size;
    private T[] itemArray;


    public CircularQueue(int size){
        this.front = 0;
        this.rear = 0;
        this.size = size;
        itemArray = (T[]) new Object[this.size];
    }

    @Override
    public boolean isEnpty() {
        return (front==rear);
    }

    @Override
    public boolean isFull() {
        return (((rear+1)%this.size)==front);
    }

    public void add(T item) {
        if (isFull()){
            throw new RuntimeException("Queue is full");
        }else {
            rear = (rear+1) % this.size;
            itemArray[rear] = item;
        }
    }

    @Override
    public T pull() {
        if (isEnpty()){
            throw new RuntimeException("Queue is empty");
        }else{
            front = (front+1)%this.size;
            return itemArray[front];
        }
    }

    @Override
    public T peek() {
        return null;
    }
}
