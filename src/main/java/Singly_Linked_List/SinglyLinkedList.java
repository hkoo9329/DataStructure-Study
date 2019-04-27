package Singly_Linked_List;

import javax.jws.Oneway;
import java.util.List;

public class SinglyLinkedList implements LinkedList {

    private Node head;
    private Node last;
    private int size;

    public SinglyLinkedList(){
        this.size = 0;
        this.head = null;
        this.last = null;
    }


    @Override
    public void add(Object data) {
        if (isEmpty()){
            head = new Node(data);
            last = head;
        }else{
           last.setNext(new Node(data));
           last = last.getNext();
        }
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object remove() {
        if (isEmpty()){
            throw new RuntimeException("list is empty");
        }else {
            if (size == 1) {
                Object data = head.getData();
                clear();
                size--;
                return data;
            } else {
                Object data = last.getData();
                Node tmp = head;
                while (tmp.getNext() != last) {
                    tmp = tmp.getNext();
                }
                tmp.setNext(null);
                last = tmp;
                size--;
                return data;
            }
        }
    }

    @Override
    public int indexOf(Object data) {
        int index=0;
        Node  tmp = head;
        while (tmp!=null){
            if (tmp.getData().equals(data)){
                return index;
            }else{
                tmp = tmp.getNext();
                index++;
            }
        }
        return -1;
    }

    @Override
    public boolean searchNode(Object data) {
        Node tmp = head;
        while (tmp != null){
            if (tmp.getData().equals(data)){
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (head==null);
    }

    @Override
    public void clear() {
        this.head = null;
        this.last = null;
    }
}
