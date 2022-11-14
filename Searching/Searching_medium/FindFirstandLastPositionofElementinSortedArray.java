package interviewQBS;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target)
    {
        int[] result = {-1,-1};
        result[0] = search(nums,target,true);
        if(result[0] != -1){
            result[1] = search(nums,target,false);
        }
        return result;
    }
    public static int search(int[] nums,int target,boolean findStartIndex)
    {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                ans = mid;
                if(findStartIndex)
                {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
