package Sorting_Easy;

public class MissingNumber {
    public static void main(String[] args) {
//        nums array must consists of 0 to nums.length values
        int[] nuns = {1,2,3,4,5,6};
        System.out.println(missingNumber(nuns));
    }
    static int missingNumber(int[] nums)
    {
        int sum = 0;
        int n = nums.length;
        for(int i : nums) {
            sum += i;
        }
//        n*(n+1)/2 is to find the sum of n natural n numbers
        return n*(n+1) / 2  - sum ;
    }
}
