package Recursion_Easy;
//https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,6,7,12,23,32,54,67,79};
        int target = 54;
        int start =  0;
        int end = arr.length - 1;
        System.out.println("target found on index Number " + search(arr,target,start,end));
    }
    static int search(int[] arr,int target,int start,int end)
    {
        if(start > end)
        {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target)
        {
            return mid;
        }
        if(arr[mid] < target)
        {
            return search(arr,target,mid+1,end);
        }
        return search(arr,target,start,mid-1);
    }
}
