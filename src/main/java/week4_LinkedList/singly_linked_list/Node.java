package week4_LinkedList.singly_linked_list;


import lombok.Data;

@Data
public class Node {
    private Object data;
    private Node next;

    public Node() {
        this.data = null;
        this.next = null;
    }

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    public Node(Object data, Node node) {
        this.data = data;
        this.next = node;
    }
}
