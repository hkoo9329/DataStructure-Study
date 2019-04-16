package week6_Stack.palindrome;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String insertItem = sc.nextLine();
            if (insertItem.equals("q"))
                break;
            else {
                if (palinCheck(insertItem)){
                    System.out.println("회문입니다.");
                }
                else {
                    System.out.println("회문이 아닙니다.");
                }
            }
        }
        System.out.println("종료되었습니다.");
    }

    public static boolean palinCheck(String str) {
        LinkedStack stack = new LinkedStack();
        boolean oddCheck = (str.length() % 2 == 1);
        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() / 2) {
                stack.push(str.charAt(i));
            } else {
                if (oddCheck) {
                    i++;
                    oddCheck = false;
                }
                if(stack.pop()!=str.charAt(i)){
                    return false;
                }

            }

        }

        return true;
    }
}
