package minggu7;

public class InFix {

    int n, top;
    String[] stack;

    InFix(int total) {
        n = total;
        top = -1;
        stack = new String[n];
//        push("(");
    }

    void push(String c) {
        top++;
        stack[top] = c;
    }

    String pop() {
        String item = stack[top];
        top--;
        return item;
    }

    String convertInFix(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (isOperand(c)) {
                if (c == ' ' || c == '.') {
                    continue;
                }
                String temp = String.valueOf(c);
                push(temp);
            }
            if (isOperator(c)) {
                if (top > 0) {
                    String temp = pop();
                    if (c == '/' || c == '*' || c == '^' || c== '%') {
                        if (stack[top].length() > 1) {
                            boolean kalibagi = false;
                            for (int j = 0; j < temp.length(); j++) {
                                char cekOperator = temp.charAt(j);
                                if (cekOperator == '*' || cekOperator == '/' || c == '^' || c== '%') {
                                    kalibagi = true;
                                }
                            }
                            if (kalibagi) {
                                P = "(" + pop() + ")" + c + temp;
                            } else {
                                P = "(" + pop() + ")" + c + "(" + temp + ")";
                            }
                        } else {
                            if (temp.length() > 1) {
                                P = pop() + c + "(" + temp + ")";
                            } else {
                                P = pop() + c + temp ;
                            }
                        }
                    } else {
                        P = pop() + c + temp;
                    }
                    push(P);
                }
            }
        }
        return P;
    }

    boolean isOperand(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == ' ' || c == '.'));
    }

    boolean isOperator(char c) {
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+');
    }
}
