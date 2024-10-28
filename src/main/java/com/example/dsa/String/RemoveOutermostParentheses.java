package main.java.com.example.dsa.String;

public class RemoveOutermostParentheses {

        public String removeOuterParentheses(String s) {
            StringBuilder result = new StringBuilder();
            int balance = 0;

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    if (balance > 0) {
                        result.append(c);  // Only add if not an outermost '('
                    }
                    balance++;  // Increase balance for '('
                } else {
                    balance--;  // Decrease balance for ')'
                    if (balance > 0) {
                        result.append(c);  // Only add if not an outermost ')'
                    }
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            RemoveOutermostParentheses solution = new RemoveOutermostParentheses();

            // Test cases
            System.out.println(solution.removeOuterParentheses("(()())(())"));          // Expected output: "()()()"
            System.out.println(solution.removeOuterParentheses("(()())(())(()(()))"));  // Expected output: "()()()()(())"
            System.out.println(solution.removeOuterParentheses("()()"));                // Expected output: ""
        }
}


