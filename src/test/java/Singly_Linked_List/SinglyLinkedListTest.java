package Singly_Linked_List;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SinglyLinkedListTest {

    private SinglyLinkedList linkedList;

    @Before
    public void init() {
        linkedList = new SinglyLinkedList();
    }

    @Before
    @Test
    public void add() {
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
    }

    @Test
    public void size() {
        log.info(linkedList.size()+"");
    }

    @Test
    public void remove() {
        while (linkedList.size()>0){
            log.info(linkedList.remove()+"");
        }
    }

    @Test
    public void indexOf() {
        linkedList.add("테스트");
        log.info(linkedList.indexOf("테스트")+"");
        log.info(linkedList.indexOf("없는데이터")+"");

    }

    @Test
    public void searchNode() {
        linkedList.add("테스트데이터");
        boolean result=linkedList.searchNode("테스트데이터");
        assertTrue(result);
    }

    @Test
    public void isEmpty() {
        assertFalse(linkedList.isEmpty());
    }

    @Test
    public void clear() {
        linkedList.clear();
        assertTrue(linkedList.isEmpty());
    }
}