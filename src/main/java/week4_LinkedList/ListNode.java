package week4_LinkedList;


import lombok.Data;

@Data
public class ListNode {
    private Object data;
    private ListNode next;

    public ListNode() {
        this.data = null;
        this.next = null;
    }

    public ListNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(Object data, ListNode node) {
        this.data = data;
        this.next = node;
    }
}
