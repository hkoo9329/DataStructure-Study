package week4_LinkedList;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class LinkedListTest {

    private LinkedList list;
    @Before
    public void LinkedListConstructor(){
        list = new LinkedList();
    }

    @Before
    @Test
    public void 뒤에_데이터_삽입_테스트(){
        for(int i=0;i<10;i++){
            list.addLast(new ListNode(i+"번"));
        }
        log.info(list.printList());
    }

    @Test
    public void 리스트_삭제_테스트(){
        list.FindDeleteNode("qwe");
        log.info(list.printList());
    }

    @Test
    public void 앞에_데이터_삽입(){
        list.addFirst(new ListNode("*"));
        log.info(list.printList());
    }
    @Test
    public void 뒤에_데이터_삭제(){
        list.removeLast();
        log.info(list.printList());
    }
    @Test
    public void 앞에_데이터_삭제(){
        list.removeFirst();
        log.info(list.printList());
    }



}