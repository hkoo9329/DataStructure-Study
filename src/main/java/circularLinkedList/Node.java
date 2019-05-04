package circularLinkedList;

import lombok.Data;

@Data
class Node {

    private Object data;
    private Node node;

    public Node(){
        this.data = null;
        this.node = null;
    }
    public Node(Object data){
        this.data = data;
        this.node = null;
    }

}
