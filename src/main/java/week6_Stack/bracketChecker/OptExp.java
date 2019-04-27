package week6_Stack.bracketChecker;

class OptExp {
    private String exp;
    private int expSize;
    private char testCh, openPair;

    public boolean testPair(String exp) {
        this.exp = exp;
        this.expSize = exp.length();
        ArrayStack stack = new ArrayStack(expSize);

        for (int i = 0; i < expSize; i++) {
            testCh = this.exp.charAt(i);
            switch (testCh) {
                case '(':
                case '{':
                case '[':
                    stack.push(testCh);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.isEmpty())
                        return false;
                    else {
                        openPair = stack.pop();
                        if ((openPair == '(' && testCh != ')') ||
                                (openPair == '{' && testCh != '}') ||
                                (openPair == '[' && testCh != ']'))
                            return false;
                        else
                            break;
                    }
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
