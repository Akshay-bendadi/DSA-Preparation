package interviewQBS;
// Smallest number greater than or equals to target
public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,11,26,57,78,89,95,105,155,185};
        int target = 1;
        System.out.println("target found on index " + floor(arr,target));
    }

    //    return the index of the smallest number >= target
    static int floor(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
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
        return end;
    }
}
