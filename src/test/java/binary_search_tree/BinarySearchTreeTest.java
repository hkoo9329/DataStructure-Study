package binary_search_tree;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinarySearchTree BST;
    @Before
    public void init(){
        BST = new BinarySearchTree();
    }

    @Test
    public void 트리_print_테스트(){
        int[] insertNode = {2,3,5,1,4,8,7};

        Arrays.stream(insertNode).forEach(i ->{
            BST.insert(i);
        });

        BST.printBST();
    }
}