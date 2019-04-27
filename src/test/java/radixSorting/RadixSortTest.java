package radixSorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class RadixSortTest {

    private RadixSort radixSort = new RadixSort();


    @Test
    public void 기수정렬_테스트_케이스(){
        int[] array = {12,326,127,467,110,58};
        int[] result = radixSort.sort(array);
        int[] test = {12,58,110,127,326,467};
        assertArrayEquals(result,test);
    }

}