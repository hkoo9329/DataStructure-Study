package binary_search_tree;

import lombok.Data;

@Data
public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(){
        this.left = null;
        this.right = null;
    }


    public Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
