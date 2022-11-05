package Array_Easy;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,6,2,10};
        System.out.println(Arrays.toString(shuffle(arr,4)));
    }

    public static int[] shuffle(int[] nums, int n) {
            int[] result = new int[2*n];
            int count =0;
            for(int i=0 ; i < nums.length ; i+=2)
            {
                result[i]=nums[count];
                result[i+1]=nums[n+count];
                count++;

            }
            return result;
         }
}
