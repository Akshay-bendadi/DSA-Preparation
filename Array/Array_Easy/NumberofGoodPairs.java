package Array_Easy;

//Given an array of integers nums, return the number of good pairs.
//        A pair (i, j) is called good if nums[i] == nums[j] and i < j.

import java.util.Arrays;

public class NumberofGoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
            int count=0;
            for(int i=0;i<nums.length;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]==nums[j] && i < j) count++;
                }
            }
            return count;
        }
}
