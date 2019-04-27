package week7_Queue.prefixToPostfix;

import java.util.Stack;
import java.util.StringTokenizer;

class Postfix {
    private String equation;
    private ArrayStack stack;

    boolean is_operator(char item) {
        return (item == '+' || item == '-' || item == '*' || item == '/');
    }

    int priority(char op) {
        if (op == '(')
            return 0;
        else if (op == '+' || op == '-')
            return 1;
        else if (op == '*' || op == '/')
            return 2;
        else
            return 3;
    }

    public Postfix(String equation) {
        this.equation = equation;
        this.stack = new ArrayStack(equation.length());
    }


    public String getPostfix() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < equation.length(); i++) {
            char item = equation.charAt(i);
            if (item == '(') {
                stack.push(item);
            } else if (item == ')') {
                while ((char) stack.peek() != '(') {
                    stringBuilder.append(stack.pop());
                }
                stack.pop();
            } else if (is_operator(item)) {
                while (!stack.isEmpty() && priority((char) stack.peek()) >= priority(item)) {

                    stringBuilder.append(stack.pop());
                }
                stack.push(item);
            } else if (numberCheck(item)) {
                stringBuilder.append(item);
            }
        }
        while (!stack.isEmpty())
            stringBuilder.append(stack.pop());

        return stringBuilder.toString();
    }

    public boolean numberCheck(char s) {
        try {
            Integer.parseInt(String.valueOf(s));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int optPostfix(String postExp) {
        stack.clear();
        for (int i = 0; i < postExp.length(); i++) {
            char item = postExp.charAt(i);
            if (numberCheck(item)) {
                stack.push(Character.getNumericValue(item));
            } else {
                int operator2 = (int) stack.pop();
                int operator1 = (int) stack.pop();
                switch (item) {
                    case '+':
                        stack.push(operator1 + operator2);
                        break;
                    case '-':
                        stack.push(operator1 - operator2);
                        break;
                    case '*':
                        stack.push(operator1 * operator2);
                        break;
                    case '/':
                        stack.push(operator1 / operator2);
                        break;
                }
            }
        }
        return (int) stack.pop();
    }
}
