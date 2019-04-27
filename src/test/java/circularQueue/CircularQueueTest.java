package circularQueue;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class CircularQueueTest {

    @Test
    public void add_기능_pull_기능_테스트(){
        CircularQueue<Integer> queue = new CircularQueue<Integer>(11);
        for (int i=0;i<10;i++){
            queue.add(i);
        }
        while (!queue.isEnpty()){
            log.info(queue.pull()+"");
        }

    }
    @Test
    public void 제네릭_입력_테스트(){
        CircularQueue<String> str = new CircularQueue<String>(10);
        CircularQueue<Integer> integerQueue = new CircularQueue<Integer>(10);
        CircularQueue<Character> charQueue = new CircularQueue<Character>(10);
        person p1 = new person(10,"남");
        CircularQueue<person> personQueue = new CircularQueue<person>(10);

        str.add("테스트");
        integerQueue.add(10);
        charQueue.add('s');
        personQueue.add(p1);

    }

    private class person{
        private int age;
        private String sex;

        public person(int age, String sex){
            this.age = age;
            this.sex = sex;
        }
    }

}