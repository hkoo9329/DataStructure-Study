package week4_LinkedList.circular_linked_list;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class Circular_LinkedListTest {
    private Circular_LinkedList circularList;

    @Before
    public void Circular_LinkedList_init() {
        circularList = new Circular_LinkedList();
    }

    @Before
    @Test
    public void 입력_테스트_케이스() {
        for (int i = 0; i < 10; i++) {
            circularList.addLast(i);
        }
        System.out.println(circularList.printList());
    }

    @Test
    public void 원형이_연결되었는지_테스트() {
        ListNode node = circularList.searchNode(0);
        int count = 0;
        while (node != null) {
            if (count > circularList.size()) {
                log.info("원형이 연결되어있습니다.");
                break;
            }
            node = node.getNext();
            count++;
        }
    }

}