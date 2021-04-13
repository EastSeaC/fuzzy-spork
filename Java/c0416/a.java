package Java.c0416;

import java.util.Stack;
// import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean isDigits(String a) {
        return !Pattern.matches("[+-/*]", a);
    }

    public int evalRPN(String[] tokens) {
        int a, b;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isDigits(tokens[i])) {
                stack.push(tokens[i]);
            } else {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                switch (tokens[i]) {
                case "+":
                    stack.push(String.valueOf(a + b));
                    break;
                case "-":
                    stack.push(String.valueOf(b - a));
                    break;
                case "*":
                    stack.push(String.valueOf(b * a));
                    break;
                case "/":
                    stack.push(String.valueOf(b / a));
                    break;
                }
            }
        }
        return Integer.parseInt(stack.pop());
    }
}

public class a {

    public static void main(String[] args) {
        Solution solution = new Solution();
        // String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17",
        // "+", "5", "+" };
        String[] tokens = { "4", "3", "-" };
        int result = solution.evalRPN(tokens);
        // boolean result=solution.isDigits("*");
        System.out.println(result);

    }
}