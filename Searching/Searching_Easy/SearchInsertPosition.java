package Searching;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println("Enter the target::");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println("Target found on " + searchInsert(arr,target) + "th index");
    }
    public static int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;
            while(start <= end)
            {
                int mid = start + (end - start) / 2;
                if(nums[mid] == target)
                    return mid;
                else if(nums[mid]>target)
                    end = mid -1;
                else
                    start=mid+1;
            }
            return start;
        }
    }

