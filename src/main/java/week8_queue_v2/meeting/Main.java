package week8_queue_v2.meeting;

import java.util.Scanner;

public class Main {

    private static LinkedQueue manQueue;
    private static LinkedQueue womanQueue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        manQueue= new LinkedQueue();
        womanQueue = new LinkedQueue();
        String inputstr="";
        while (true){
            System.out.print("성별과 이름을 입력하시오 <종료는 q> <ex 남 홍길동 > : ");
            inputstr = sc.nextLine();

            if (inputstr.equals("q")){
                break;
            }
            QNode node = getNode(inputstr);

            if(node.sex.equals("남")){
                manQueue.enQueue(node);
            }else if (node.sex.equals("여")){
                womanQueue.enQueue(node);
            }else{
                System.out.println("성별을 다시 입력하시오.");
                continue;
            }

            printResult();
            System.out.println();

        }

        System.out.println("종료되었습니다.");
    }

    private static QNode getNode(String inputstr) {
        String data[] = inputstr.split(" ");
        String sex = data[0];
        String name = data[1];
        return new QNode(sex,name);
    }
    private static void printResult(){
        if(!manQueue.isEmpty() && !womanQueue.isEmpty()){
            System.out.println("남자 큐 : "+manQueue.printQueue());
            System.out.println("여자 큐 : "+womanQueue.printQueue());
            System.out.println("==========================");
            System.out.println("☆★☆★ 커플이 탄생하였습니다 "+manQueue.deQueue().name
                    +"과(와) "+womanQueue.deQueue().name+" ☆★☆★");
            System.out.println("==========================");
            System.out.println("커플 탄생 후 남자 큐 : "+manQueue.printQueue());
            System.out.println("커플 탄생 후 여자 큐 : "+womanQueue.printQueue());
        }else{
            System.out.println("아직 대상자가 없습니다. 기다려주세요.");
            System.out.println("남자 큐 : "+manQueue.printQueue());
            System.out.println("여자 큐 : "+womanQueue.printQueue());
        }
    }
}
