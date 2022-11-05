package Array_Easy;

import java.util.Arrays;

public class SumOf1DArray {
    public static void main(String[] args) {
        int[] arr = {10,5,15,6,5,25,12};
        int[] sum= runningSum(arr);
        System.out.println(Arrays.toString(sum));
    }
        static int[] runningSum(int[] nums) {
            int sum=0;
            for(int i=0;i<nums.length;i++)
            {
                sum+= nums[i];
                nums[i] = sum;
            }
            return nums;
        }
}
