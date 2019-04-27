package week3_array.Polynomial;


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class PolyMain {

    public static void main(String[] args) {
        String[] testCase = "4x^3+3x^2+5x^1 3x^4+1x^3+2x^1+1x^0".split(" ");
        StringTokenizer tokenizerA = new StringTokenizer(testCase[0], "x^+");
        StringTokenizer tokenizerB = new StringTokenizer(testCase[1], "x^+");
        OperatePoly operatePoly = new OperatePoly();
        int[] A = getArray(tokenizerA);
        int[] B = getArray(tokenizerB);
        int[] C = operatePoly.addPoly(A, B);
        System.out.println(operatePoly.polyToString(A));
        System.out.println(operatePoly.polyToString(B));
        System.out.println(operatePoly.polyToString(C));

    }

    public static int[] getArray(StringTokenizer tokenizer) {
        int number = Integer.parseInt(tokenizer.nextToken());
        int degree = Integer.parseInt(tokenizer.nextToken());
        int[] array = new int[degree + 1];
        array[degree] = number;

        while (tokenizer.hasMoreTokens()) {
            number = Integer.parseInt(tokenizer.nextToken());
            degree = Integer.parseInt(tokenizer.nextToken());
            array[degree] = number;
        }
        return array;

    }
}
