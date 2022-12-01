package interviewQBS;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println( search(nums,target));
    }

    public static int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        //  this if will execute when array isn't rotated
        if(pivot == -1)
        {
//            so we have to perform simple binary search
            return BinarySearch(nums,target,0,nums.length-1);
        }
//       if pivot isn't a -1 so we found 2 ascending arrays
//        here, we are going check 3 case
        if(nums[pivot] == target)   // arr[pivot] is target
        {
            return pivot;
        }
        if(target >= nums[0])       // if it's true then the target is on the left side of and array
        {
            return BinarySearch(nums,target,0,pivot - 1);
        }

        return BinarySearch(nums,target,pivot+1,nums.length-1);       // if it's true then the target is on the right side of and array
    }

    public static int BinarySearch(int[] nums, int target, int start, int end) {
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else if (nums[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

//    This pivot function not work for the duplicate values
    public static int findpivot(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;
        while(start < end)
        {
            int mid = start + (end - start) / 2;
//         here,  we are going to check for 4 cases
            if(mid < end && nums[mid] > nums[mid + 1])        // it's checking the array from right side of the array
            {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1])      // it's checking the array from the left side of the array
            {
                return mid - 1;
            }
            if(nums[mid] <= nums[start])        // if current element is less than the start element than
            {                                 // ignore the right side of the array part
                end = mid - 1;
            }
        else                                   // if current element is greater than the start element than
            {                                 // ignore the left side of the array part
                start = mid + 1;
            }
        }
        return -1;
    }
}
