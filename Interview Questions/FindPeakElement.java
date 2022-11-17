package interviewQBS;
// https://leetcode.com/problems/find-peak-element/description/
public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,10,5,3};
        System.out.println(BinarySearch(arr));
    }

    private static int BinarySearch(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while(start < end)
    {
        int mid = start + (end - start) / 2;
        if(arr[mid] > arr[mid + 1])
        {
            end = mid;
        }
        else {
            start = mid + 1;
        }
    }
    return start;
    }
}
