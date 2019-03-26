package week4_LinkedList;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedList {
    private ListNode head;
    private ListNode last;

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
        ListNode node = head;
        if (head == null) {
            log.error("list의 크기가 0입니다.");
        } else {
            while (node.getNext() != null) {
                if (node.getNext().equals(last)) {
                    node.setNext(null);
                } else {
                    node = node.getNext();
                }
            }

        }
    }

    public void addLast(ListNode node) {
        if (head == null) {
            head = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public void addFirst(ListNode node) {
        if (head == null) {
            head = node;
            last = node;
        } else {
            ListNode tmp = head;
            node.setNext(tmp);
            head = node;
        }
    }

    public Boolean searchNode(Object data) {
        if (head == null)
            return false;
        ListNode node = head;
        while (node != null) {
            if (node.getData().equals(data)) {
                return true;
            } else
                node = node.getNext();
        }
        return false;
    }

    public void FindDeleteNode(Object data) {
        ListNode pre, tmp;
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
        ListNode tmp = this.head;
        String result = "";
        while (tmp != null) {
            if (tmp.getNext()==null) {
                result += tmp.getData();
                break;
            } else {
                result += tmp.getData() + ",";
                tmp = tmp.getNext();
            }
        }
        return result.equals("")? "리스트가 비어있습니다." : result;
    }
}
