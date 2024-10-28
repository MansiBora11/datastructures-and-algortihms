package main.java.com.example.dsa.TwoPointers;//Problem Link: https://leetcode.com/problems/3sum/description/
import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        Set<List<Integer>>result=new HashSet<>();
        for(int i=0; i<nums.length-2; i++){
            int left= i+1;
            int right= nums.length-1;

            while(left<right){
                int sum=nums[i]+ nums[left]+ nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0)
                    left++;
                else
                    right--;
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }

    }

}
