import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

@Slf4j
public class examTest {

    @Test
    public void 숫자_자릿수별_합_계산() {
        int n = 987;
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n = n / 10;
        }
        log.info(result + "");
    }

    @Test
    public void 괄호_확인_알고리즘() {
        String s = "()";
        Stack checker = new Stack();
        try {
            for (int i = 0; i < s.length(); i++) {
                char bracket = s.charAt(i);
                if (bracket == '(') {
                    checker.push(bracket);
                } else if (bracket == ')') {
                    checker.pop();
                }
            }
        } catch (EmptyStackException e) {
            //return false;
        }

        if (checker.isEmpty()) {
           // return true;
        } else {
            //return false;
        }
    }

    @Test
    public void 날짜별_요일계산() {
        // 2016년 기준
        // 2016년 1월 1일이 금요일 그리고 윤년
        int a, b;
        a = 10;
        b = 20;
        int result = 0;
        for (int i = 1; i < a; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    result += 31;
                    break;
                case 2:
                    result += 29;
                    break;
                default:
                    result += 30;
                    break;
            }
        }
        result+=b;

        switch (result%7){
            case 0:
                log.info("목");
                break;
            case 1:
                log.info("금");
                break;
            case 2:
                log.info("토");
                break;
            case 3:
                log.info("일");
                break;
            case 4:
                log.info("월");
                break;
            case 5:
                log.info("화");
                break;
            case 6:
                log.info("수");
                break;
        }
    }

    @Test
    public void 스트링_최소값_최대값_찾기(){
        String str="-1 -2 -3 -4";

        StringTokenizer tokenizer = new StringTokenizer(str," ");
        int max,min;
        max = Integer.parseInt(tokenizer.nextToken());
        min = max;
        while (tokenizer.hasMoreTokens()){
            int number = Integer.parseInt(tokenizer.nextToken());

            if (number>max){
                max = number;
            }

            if (number<min){
                min = number;
            }

        }

        log.info(min+" "+max);
    }

    @Test
    public void 백트레킹(){
        int [] numbers = {1,1,1,1,1};

        int target =3;

        ArrayList<Integer> tree = new ArrayList<Integer>();

        tree.add(1,0);



    }
    public void makeTree(int number, int index,int[] numbers){
        if (number>numbers.length){
            return;
        }
        
    }

    @Test
    public void nullPointTest(){
        Object[] a = new Object[10];
        Assert.assertNull(a[0]);
    }

    @Test
    public void 경로_확인_테스트(){

        System.out.println(new java.io.File("").getAbsolutePath());

    }



}
