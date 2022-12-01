package InterviewSorting;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

    public class FindAllDuplicatesinanArray
    {

        public static void main(String[] args)
        {
            int[] nums = {4,3,2,7,8,2,3,1};
            System.out.println(findDuplicate(nums));
        }
        static List<Integer> findDuplicate(int[] nums) {
            int index = 0;
            while (index < nums.length) {
                int correctIndex = nums[index] - 1;
                if (nums[index] != nums[correctIndex]) {
                    swap(nums, index, correctIndex);
                } else {
                    index++;
                }
            }
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != i+1)
                {
                    ans.add(nums[i]);
                }
            }
            return ans;
        }
        static int[] swap(int[] nums, int first, int last)
        {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            return nums;
        }
    }
