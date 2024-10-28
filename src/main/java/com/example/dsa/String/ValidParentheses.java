package main.java.com.example.dsa.String;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();


        for (char c : s.toCharArray()) {

            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            }
            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();

        // Test cases
        System.out.println(solution.isValid("()"));      // true
        System.out.println(solution.isValid("()[]{}"));  // true
        System.out.println(solution.isValid("(]"));      // false
        System.out.println(solution.isValid("([)]"));    // false
        System.out.println(solution.isValid("{[]}"));    // true
    }
}
