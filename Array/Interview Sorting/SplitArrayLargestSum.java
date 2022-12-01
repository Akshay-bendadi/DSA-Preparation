package interviewQBS;

//  https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8,4};
        int m = 2;
        System.out.println(splitArray(arr,m));
    }
    public static int splitArray(int[] nums, int m) {
    int start = 0;
    int end = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);    // in the end of the loop it will find max number in the array
            end+=nums[i];       // in the end it will sum of the all the number
        }
//        binary search
        while(start < end)
        {
            int mid = start + (end - start) / 2;
//            calculate how many pieces we can divide this in with the max sum
            int sum = 0;
            int piece = 1;
            for(int num : nums)
            {
                if(sum + num > mid)
                {
                    // it's greater than mid, so we can add it into sub array,make a new array
//                    add this nums in the new sub array,then sum = num
                    sum = num;
                    piece++;
                }
                else {
                    sum += num;
                }
            }
            if(piece > m)
            {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}
