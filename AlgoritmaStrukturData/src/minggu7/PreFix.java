package minggu7;

public class PreFix {

    int n, top;
    char[] stack;

    PreFix(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    void push(char c) {
        top++;
        stack[top] = c;
    }

    char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    String convertPreFix(String Q) {
        boolean firstReverse = true;
        Q = reverseString(Q,firstReverse);
        String P = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (isOperand(c)) {
                P = P + c;
            } else if (c == '(') {
                push(c);
            } else if (isOperator(c)) {
                while (presedence(stack[top]) >= presedence(c)) {
                    P = P + pop();
                }
                push(c);
            } else if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                char temp = pop();
            }
        }
        firstReverse = !firstReverse;
        P = reverseString(P,firstReverse);
        return P;
    }

    boolean isOperand(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == ' ' || c == '.'));
    }

    boolean isOperator(char c) {
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+');
    }

    int presedence(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    String reverseString(String Q, boolean firstReverse) {
        char[] temparray = Q.toCharArray();
        char[] hasilarray;

        if (firstReverse) {
            hasilarray = new char[temparray.length + 1];
            for (int i = 0; i < hasilarray.length; i++) {
                if (i == hasilarray.length-1) {
                    hasilarray[i] = ')';
                } else {
                    if (temparray[temparray.length - i - 1] == '(') {
                        temparray[temparray.length - i - 1] = ')';
                    } else if (temparray[temparray.length - i - 1] == ')') {
                        temparray[temparray.length - i - 1] = '(';
                    }
                    hasilarray[i] = temparray[temparray.length - i - 1];
                }
            }
        } else {
            hasilarray = new char[temparray.length];
            for (int i = 0; i < hasilarray.length; i++) {
                if (temparray[temparray.length - i - 1] == '(') {
                    temparray[temparray.length - i - 1] = ')';
                } else if (temparray[temparray.length - i - 1] == ')') {
                    temparray[temparray.length - i - 1] = '(';
                }
                hasilarray[i] = temparray[temparray.length - i - 1];
            }
        }

        String P = String.valueOf(hasilarray);
        return P;
    }
}
