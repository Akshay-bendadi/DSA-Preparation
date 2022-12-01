package InterviewSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    static List<Integer> findDisappearedNumbers(int[] nums)
    {
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
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] != i+1)
            {
                answer.add(i+1);
            }
        }
        return answer;
    }

    static int[] swap(int[] nums, int first, int last)
    {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
        return nums;
    }
}
