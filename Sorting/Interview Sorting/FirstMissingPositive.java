package InterviewSorting;
//https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
       int index = 0;
       while(index<nums.length)
       {
           int correctIndex = nums[index] - 1;
           if(nums[index] > 0 && nums[index]<= nums.length && nums[index] != nums[correctIndex])
           {
               swap(nums,index,correctIndex);
           }
           else {
               index++;
           }
       }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1)
            {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

   static int[] swap(int[] nums, int index, int correctIndex) {
        int temp = nums[index];
        nums[index] = nums[correctIndex];
        nums[correctIndex] = temp;

        return nums;
    }
}
