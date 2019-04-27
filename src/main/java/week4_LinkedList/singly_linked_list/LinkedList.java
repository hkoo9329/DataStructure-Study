package week4_LinkedList.singly_linked_list;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class LinkedList {
    private Node head;
    private Node last;

    public LinkedList() {
        head = null;
        last = null;
    }

    public void init() {
        head = null;
        last = null;
    }

    public void removeFirst() {
        if (head == null)
            log.error("list의 크기가 0입니다.");
        else {
            if (head.getNext() == null) {
                head = null;
                last = null;
            } else {
                head = head.getNext();
            }
        }
    }

    public void removeLast() {
        Node node = head;
        if (head == null) {
            log.error("list의 크기가 0입니다.");
        } else {
            while (node.getNext() != null) {
                if (node.getNext().equals(last)) {
                    node.setNext(null);
                    last = node;
                } else {
                    node = node.getNext();
                }
            }

        }
    }

    public void addLast(Node node) {
        if (head == null) {
            head = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public void addFirst(Node node) {
        if (head == null) {
            head = node;
            last = node;
        } else {
            Node tmp = head;
            node.setNext(tmp);
            head = node;
        }
    }

    public Boolean searchNode(Object data) {
        if (head == null)
            return false;
        Node node = head;
        while (node != null) {
            if (node.getData().equals(data)) {
                return true;
            } else
                node = node.getNext();
        }
        return false;
    }

    public void FindDeleteNode(Object data) {
        Node pre, tmp;
        if (!searchNode(data)) {
            log.error("해당 data가 list에 존재하지 않습니다.");
        } else {
            pre = head;
            tmp = head.getNext();
            if (head.getData().equals(data)) {
                head = tmp;
            } else {
                while (tmp != null) {
                    if (tmp.getData().equals(data)) {
                        pre.setNext(tmp.getNext());
                        break;
                    } else {
                        pre = tmp;
                        tmp = tmp.getNext();
                    }
                }
            }
        }
    }
    public String printList() {
        Node tmp = this.head;
        StringBuilder sentence = new StringBuilder();
        while (tmp != null) {
            if (tmp.getNext()==null) {
                sentence.append(tmp.getData());
                break;
            } else {
                sentence.append(tmp.getData()+", ");
                tmp = tmp.getNext();
            }
        }
        return sentence.toString().equals("")? "리스트가 비어있습니다." : sentence.toString();
    }
}
