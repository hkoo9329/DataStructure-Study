package week8_queue_v2.meeting;

public class MeetingQueue {
    private LinkedQueue manQueue;
    private LinkedQueue womanQueue;

    public MeetingQueue(){
        this.manQueue = new LinkedQueue();
        this.womanQueue = new LinkedQueue();
    }

    public boolean insertNode(String data){
        String[] person = data.split(" ");
        QNode node = new QNode(person[0],person[1]);
        if (node.sex.equals("남")){
            manQueue.enQueue(node);
            return true;
        }else if (node.sex.equals("여")){
            womanQueue.enQueue(node);
            return true;
        }else{
            System.out.println("성별을 다시 입력해주세요.");
            return false;
        }
    }

//    public void printResult(){
//        if(!manQueue.isEmpty() && !womanQueue.isEmpty()){
//            System.out.println("남자 큐 : "+manQueue.printQueue());
//            System.out.println("여자 큐 : "+womanQueue.printQueue());
//            System.out.println("==========================");
//            System.out.println("☆★☆★ 커플이 탄생하였습니다 "+manQueue.deQueue().name
//                    +"과(와) "+womanQueue.deQueue().name+" ☆★☆★");
//            System.out.println("==========================");
//            System.out.println("커플 탄생 후 남자 큐 : "+manQueue.printQueue());
//            System.out.println("커플 탄생 후 여자 큐 : "+womanQueue.printQueue());
//        }else{
//            System.out.println("아직 대상자가 없습니다. 기다려주세요.");
//            System.out.println("남자 큐 : "+manQueue.printQueue());
//            System.out.println("여자 큐 : "+womanQueue.printQueue());
//        }
//    }


}
