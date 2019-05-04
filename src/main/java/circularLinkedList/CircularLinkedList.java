package circularLinkedList;

public class CircularLinkedList implements LinkedList{

    @Override
    public void add(Object data) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public int indexOf(Object data) {
        return 0;
    }

    @Override
    public boolean searchNode(Object data) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
/*
private Node head;
    private Node last;
    private int size;

    public CircularLinkedList(){
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public void add(Object data) {
        Node node = new Node(data);
        if (isEmpty()){
            head = node;
            last = node;
        }else{
            last.setLink(node);
            last = node;
            last.setLink(head);
        }

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public int indexOf(Object data) {
        int index = 0;
        Node tmp = head;
        while (tmp.getLink() != head ){
            if (tmp.getData().equals(data)){
                return index;
            }else{
                tmp = tmp.getLink();
                index++;
            }
        }

        return -1;
    }

    @Override
    public boolean searchNode(Object data) {
        Node tmp = head;
        while (tmp.getLink() != head ){
            if (tmp.getData().equals(data)){
                return true;
            }else{
                tmp = tmp.getLink();
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public void clear() {
        head = null;
        last = null;
    }
 */
