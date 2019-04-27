package week7_Queue.circularQueue;

class CircularQueue implements Queue {
    private int front;
    private int rear;
    private int queueSize;
    private char itemArray[];

    public CircularQueue(int queueSize) {
        this.front = 0;
        this.rear = 0;
        this.queueSize = queueSize;
        this.itemArray = new char[this.queueSize];
    }

    @Override
    public boolean isEmpty() {
        return (front == rear);
    }

    @Override
    public boolean isFull() {
        return (((rear + 1) % queueSize) == front);
    }

    @Override
    public void enQueue(char item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % queueSize;
            itemArray[rear] = item;
        }
    }

    @Override
    public char deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        } else {
            front = (front + 1) % queueSize;
            return itemArray[front];
        }
    }

    @Override
    public void delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            front = (front + 1) % queueSize;
        }
    }

    @Override
    public char peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        } else {
            return itemArray[(front + 1) % queueSize];
        }
    }

    public void reverseQueue() {
        LinkedStack stack = new LinkedStack();
        while (!isEmpty()) {
            stack.push(deQueue());
        }
        while (!stack.isEmpty()) {
            enQueue(stack.pop());
        }
        System.out.println("reversed");

    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Circular Queue>>");
            for (int i = (front + 1) % queueSize; i != (rear + 1) % queueSize; i = ++i % queueSize) {
                System.out.print(itemArray[i] + " ");
            }
            System.out.println();
        }
    }
}
