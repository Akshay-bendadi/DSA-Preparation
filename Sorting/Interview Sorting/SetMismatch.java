package InterviewSorting;

//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        int index = 0;
        while(index < nums.length)
        {
            int correctIndex = nums[index] - 1;
            if(nums[index] != nums[correctIndex])
            {
                swap(nums,index,correctIndex);
            }
            else {
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1)
            {
                return new int[] {nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }

    static int[] swap(int[] nums, int first, int last)
    {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
        return nums;
    }
}
