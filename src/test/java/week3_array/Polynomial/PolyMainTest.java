package week3_array.Polynomial;


import lombok.extern.java.Log;
import org.junit.Test;

@Log
public class PolyMainTest {
    @Test
    public void test(){
        String[] testCase = "4x^3+3x^2+5x^1 3x^4+1x^3+2x^1+1x^0".split(" ");
        testCase[0]=testCase[0].replace("x","").replace("^","").replace("+","");
        int maxDegree = Character.getNumericValue(testCase[0].charAt(1));
        System.out.println(maxDegree);
    }


}