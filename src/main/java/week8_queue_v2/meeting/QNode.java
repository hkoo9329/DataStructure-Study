package week8_queue_v2.meeting;

class QNode {
    String sex;
    String name;
    QNode link;

    QNode(){
        this.sex = null;
        this.name = null;
        this.link = null;
    }
    QNode(String sex, String name){
        this.sex = sex;
        this.name = name;
        this.link = null;
    }
}
