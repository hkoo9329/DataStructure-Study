package week6_Stack.bracketChecker;


class ArrayStack implements Stack{
    private int top;
    private int stackSize;
    private char itemArray[];

    public int getSize() {
        return itemArray.length;
    }

    public ArrayStack(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        itemArray = new char[this.stackSize];
    }

    public void reSize() {
        stackSize = stackSize * 2;
        char[] newArray = new char[stackSize];
        for (int i = 0; i < itemArray.length; i++) {
            newArray[i] = itemArray[i];
        }
        itemArray = newArray;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == this.stackSize - 1);
    }

    @Override
    public void push(char item) {
        if (isFull()) {
            reSize();
            push(item);
        } else {
            itemArray[++top] = item;
            System.out.println("Inserted Item : " + item);
        }
    }

    @Override
    public char pop() {
        if (isEmpty()) {
            System.out.println("Deleting fail! Array Stack is empty!!");
            return 0;
        } else {
            return itemArray[top--];
        }
    }

    @Override
    public void delete() {
        if (isEmpty()) {
            System.out.println("Deleting fail! Array Stack is empty");
        } else {
            top--;
        }
    }

    @Override
    public char peek() {
        if (isEmpty()) {
            System.out.println("Peeking fail! Array Stack is empty!!");
            return 0;
        } else {
            return itemArray[top];
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Array Stack is empty!!");
        } else {
            System.out.println("Array STack >> ");
            for (int i = 0; i < top; i++) {
                System.out.print(itemArray[i] + " ");
            }
            System.out.println();
        }
    }
}
