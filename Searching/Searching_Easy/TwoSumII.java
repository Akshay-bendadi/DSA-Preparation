package Searching;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,5,7,11,15};  // Array should be sorted
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
        public static  int[] twoSum(int[] numbers, int target) {
            int start = 0;
            int end = numbers.length - 1;
            while(start<end)
            {
                if(numbers[start] + numbers[end] > target)  // if (i)th value + (j)th value is greater than the  target then decrease end pointer
                    end--;
                else if(numbers[start] + numbers[end] < target) // if (i)th value + (j)th value is greater than the target then increase start pointer
                    start++;
                else
                    break;      // (i)th value + (j)th value is equals to the target then return the positions of the number at the end of method
            }
            return new int[] {start+1,end+1}; //index's starts from 0th index to convert its position increment it by one
        }
}
