package Array_Easy;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] num = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(num)));
    }
        public static int[] buildArray(int[] nums) {
            int n=nums.length;
            for(int i=0;i<n;i++)
            {
                nums[i]=nums[i]+(n*(nums[nums[i]]%n));
            }
            for(int i=0;i<n;i++)
            {
                nums[i]/=n;
            }
            return nums;
        }
    }
