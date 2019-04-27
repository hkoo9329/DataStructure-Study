package Singly_Linked_List;

import lombok.Data;

@Data
public class Node {
    private Object data;
    private Node next;

    public Node (){
        this.data = null;
        this.next = null;
    }
    public Node (Object data){
        this.data = data;
        this.next = null;
    }
}
