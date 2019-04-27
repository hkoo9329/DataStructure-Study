package Singly_Linked_List;

public interface LinkedList {
    void add(Object data);

    int size();

    Object remove();

    int indexOf(Object data);

    boolean searchNode(Object data);

    boolean isEmpty();

    void clear();

}
