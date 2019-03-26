package week3_array.Polynomial;

import java.util.List;

public class OperatePoly {

    public OperatePoly(){

    }

    public int[] addPoly(int[] polyA, int[] polyB){
        int maxDegree= (polyA.length>polyB.length)? polyA.length : polyB.length;
        int[] polyC = new int[maxDegree];
        for(int i=0;i<polyA.length;i++){
            polyC[i] += polyA[i];
        }
        for(int i=0;i<polyB.length;i++){
            polyC[i] += polyB[i];
        }
        return polyC;
    }

    public String polyToString(int[] poly){
        String result="";
        for (int i=0;i<poly.length;i++){
            result=poly[i]+"x^"+i+" "+result;
        }

        return result;

    }
}
