package main.java.com.example.dsa.TwoPointers;//Problem Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement=target-nums[i];
            if(map.containsKey(complement))
                return new int[] {map.get(complement)+1,i+1};  //map.get(complement) gives the index of the complement in the array
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution.");
    }

    public static void main(String args[]){
        int[] nums={2, 7, 11, 15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
