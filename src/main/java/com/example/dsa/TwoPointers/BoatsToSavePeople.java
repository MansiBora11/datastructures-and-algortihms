package main.java.com.example.dsa.TwoPointers;//Problem Link: https://leetcode.com/problems/boats-to-save-people/
import java.util.Arrays;

public class BoatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0;
        int left=0;
        int right=people.length-1;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }

    public static void main(String[] args) {
        int[] n={3,2,2,1};
        int limit=3;
        System.out.println(numRescueBoats(n,limit));
    }
}

