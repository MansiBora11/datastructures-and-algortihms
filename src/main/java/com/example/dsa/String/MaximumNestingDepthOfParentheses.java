package main.java.com.example.dsa.String;

public class MaximumNestingDepthOfParentheses {

        public int maxDepth(String s) {
            int maxDepth = 0;
            int currentDepth = 0;

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    currentDepth++;
                    maxDepth = Math.max(maxDepth, currentDepth);
                } else if (c == ')') {
                    currentDepth--;
                }
            }

            return maxDepth;
        }

        public static void main(String[] args) {
            MaximumNestingDepthOfParentheses solution = new MaximumNestingDepthOfParentheses();

            // Test cases
            System.out.println(solution.maxDepth("(1+(2*3)+((8)/4))+1"));  // Expected output: 3
            System.out.println(solution.maxDepth("(1)+((2))+(((3)))"));    // Expected output: 3
            System.out.println(solution.maxDepth("()(())((()()))"));       // Expected output: 3
        }
    }


