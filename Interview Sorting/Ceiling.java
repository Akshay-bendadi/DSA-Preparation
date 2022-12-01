package interviewQBS;
// Greater number smaller than or equals to target
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,3,4,8,11,26,57,78,89,95,105,155,185};
        int target = 186;
        System.out.println("target found on index " + floor(arr,target));
    }

//    return the index of the greatest number <= target
    static int floor(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        if(target > arr[end])
            return -1;
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if(target<arr[mid])
                end = mid -1;
            else if(target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return start;
    }
}
