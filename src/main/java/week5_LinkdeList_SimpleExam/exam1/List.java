package week5_LinkdeList_SimpleExam.exam1;


import lombok.extern.slf4j.Slf4j;

@Slf4j
class List {
    private Node head;
    private Node last;

    public List() {
        head = null;
        last = null;
    }

    public void init() {
        head = null;
        last = null;
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getLast() {
        return this.last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void appendTerm(float coef, int expo) {
        Node node = new Node();
        node.setCoef(coef);
        node.setExpo(expo);
        node.setLink(null);
        addLast(node);
    }


    public void removeFirst() {
        if (head == null)
            log.error("list의 크기가 0입니다.");
        else {
            if (head.getLink() == null) {
                head = null;
                last = null;
            } else {
                head = head.getLink();
            }
        }
    }

    public void removeLast() {
        Node node = head;
        if (head == null) {
            log.error("list의 크기가 0입니다.");
        } else {
            while (node.getLink() != null) {
                if (node.getLink().equals(last)) {
                    node.setLink(null);
                } else {
                    node = node.getLink();
                }
            }

        }
    }

    public void addLast(Node node) {
        if (head == null) {
            head = node;
            last = node;
        } else {
            last.setLink(node);
            last = node;
        }
    }

    public void addFirst(Node node) {
        if (head == null) {
            head = node;
            last = node;
        } else {
            Node tmp = head;
            node.setLink(tmp);
            head = node;
        }
    }

    public Node searchNode(int data) {
        if (head == null)
            return null;
        Node node = head;
        while (node != null) {
            if (node.getExpo() == data) {
                return node;
            } else
                node = node.getLink();
        }
        return null;
    }


    public void print() {
        StringBuilder sb = new StringBuilder();
        Node node = head;
        while (node != null) {
            if (node.getCoef() >= 0) {
                sb.append("+" + node.getCoef() + "x^" + node.getExpo());
            } else {
                sb.append(node.getCoef() + "x^" + node.getExpo());
            }

            node = node.getLink();
        }
        System.out.println(sb.toString());
    }


}
