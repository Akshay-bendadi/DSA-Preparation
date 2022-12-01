package InterviewSorting;
//https://leetcode.com/problems/missing-number/description/

public class MissingNoWithCyclic {
    public static void main(String[] args) {
        int[] nums = {0,1};

        System.out.println(cyclic(nums));
    }


        static int cyclic(int[] nums)
        {
            int index = 0;
            while(index < nums.length)
            {
                int correctIndex = nums[index];
                if(nums[index]< nums.length && nums[index] != nums[correctIndex])
                {
                    swap(nums,index,correctIndex);
                }
                else {
                    index++;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != i)
                {
                    return i;
                }
            }
            return nums.length;
        }

        static int[] swap(int[] nums, int first, int last)
        {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            return nums;
        }
}