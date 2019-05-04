package week8_queue_v2.meeting;

class LinkedQueue implements Queue{
    QNode front;
    QNode rear;

    public LinkedQueue(){
        this.front = null;
        this.rear = null;
    }

    @Override
    public boolean isEmpty() {
        return (front==null);
    }

    @Override
    public void enQueue(QNode item) {
        if (isEmpty()){
            front = item;
            rear = item;
        }else{
            rear.link = item;
            rear = item;
        }
    }

    @Override
    public QNode deQueue() {
        if (isEmpty()){
            System.out.println("Deleting fail. Queue is empty");
            return null;
        }else{
            QNode tmp = front;
            front = front.link;
            if (front == null){
                rear = null;
            }
            return tmp;
        }
    }

    @Override
    public void delete() {
        if (isEmpty()){
            System.out.println("Deleting fail. Queue is empty");
        }else{
            front = front.link;
            if (front == null){
                rear = null;
            }
        }
    }

    @Override
    public QNode peek() {
        if (isEmpty()){
            System.out.println("Deleting fail. Queue is empty");
            return null;
        }else{
            return front;
        }
    }

    public String printQueue(){
        String result ="";
        if (isEmpty()){
            return "Linked Queue is empty!!";
        }else{
            QNode tmp = front;
            result+="Linked Queue>> ";
            while (tmp !=null){
                result+="("+tmp.sex+","+tmp.name+") ";
                tmp = tmp.link;
            }
        }
        return result;
    }
}
