package InterviewSorting;
//https://leetcode.com/problems/find-the-duplicate-number/

import java.util.ArrayList;
import java.util.List;

public class FindtheDuplicateNumber
{
    public static void main(String[] args)
    {
        int[] nums = {1,4,3,2,2};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums)
    {
        int index = 0;
        while(index < nums.length)
        {
            if(nums[index] != index + 1) {
                int correctIndex = nums[index] - 1;
                if (nums[index] != nums[correctIndex]) {
                    swap(nums, index, correctIndex);
                } else {
                    return nums[index];
                }
            }
            else {
                index++;
            }
        }
       return -1;
    }

    static int[] swap(int[] nums, int first, int last)
    {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
        return nums;
    }
}
