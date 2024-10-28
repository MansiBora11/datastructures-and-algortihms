package main.java.com.example.dsa.TwoPointers;

//Problem Link: https://leetcode.com/problems/sum-of-square-numbers/description/
public class SumOfSquares {
    public static boolean judgeSquareSum(int c) {
        long left=0;
        long right=(int) Math.sqrt(c);
        while(left<=right){
            long sum=left*left+right*right;
            if(sum==c)
                return true;
            else if(sum<c)
                left++;
            else
                right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int c=3;
        System.out.println(judgeSquareSum(c));
    }
}
