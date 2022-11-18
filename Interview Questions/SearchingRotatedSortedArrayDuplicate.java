package interviewQBS;

public class SearchingRotatedSortedArrayDuplicate {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,9,2};
        int target = 2;
        System.out.println( search(nums,target));
    }

    public static int search(int[] nums, int target) {
        int pivot = findpivotForDuplicate(nums);
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

    //    This pivet will work for duplicate value in the array
    public static int findpivotForDuplicate(int[] nums)
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
//            if  elements at middle,start and end are equal then just skip the duplicate
            if(nums[mid] == nums[start] && nums[mid] == nums[end])
            {
//                skipping the duplicate values from the both ends
//                What if start and end elements were be the pivot ??
//                check if start element is pivot
                if(nums[start] > nums[start + 1])
                {   // What if start
                    return start;
                }
                start++;
//                check if end element is pivot
                if(nums[end] < nums[end - 1])
                {
                    return end - 1;
                }
                end--;
            }
//            if left side is sorted then pivot should be in right
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > end)) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
