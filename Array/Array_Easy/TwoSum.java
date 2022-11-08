package Array_Easy;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,8,1,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
        public static int[] twoSum(int[] nums, int target) {
            int i=0,j=0;
            int[] result = new int[2];
            for(i=0;i<nums.length;i++)              //tests
            {                                       // nums[i] + nums[j] == target
                for(j=i+1;j<nums.length;j++)        // 2 + 7 == 9 ? yes then return indexes of i and j
                {                                   // else increment the travesing variable util it finds
                    if(nums[i]+nums[j]==target){    // if we didn't get anything return empty 0,0
                        result[0]=i;
                        result[1]=j;
                    }
                }
            }
            return result;
        }
}
