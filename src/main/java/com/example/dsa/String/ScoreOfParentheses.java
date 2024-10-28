package main.java.com.example.dsa.String;

import java.util.Stack;

public class ScoreOfParentheses {

        public int scoreOfParentheses(String s) {
            Stack<Integer> stack = new Stack<>();
            stack.push(0); // Start with an initial score of 0 for the outermost level

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(0); // Start a new score for a new level
                } else {
                    int innerScore = stack.pop(); // Pop the score of the inner level
                    int currentScore = innerScore == 0 ? 1 : 2 * innerScore;
                    stack.push(stack.pop() + currentScore); // Add the current score to the previous level
                }
            }

            return stack.pop(); // The final score is the only element left in the stack
        }

        public static void main(String[] args) {
            ScoreOfParentheses solution = new ScoreOfParentheses();

            // Test cases
            System.out.println(solution.scoreOfParentheses("()"));         // Expected output: 1
            System.out.println(solution.scoreOfParentheses("(())"));       // Expected output: 2
            System.out.println(solution.scoreOfParentheses("()()"));       // Expected output: 2
            System.out.println(solution.scoreOfParentheses("(()(()))"));   // Expected output: 6
        }
}


