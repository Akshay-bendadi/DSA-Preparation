package Binary;
public class BinarySearching {
    public static void main(String[] args) {
//        for binary Searching array should be sorted
        int[] arr = {1,3,4,8,11,26,57};
        int target = 26;
        System.out.println("target found on index" + search(arr,target));
    }
    static int search(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length;
        while(start<end)
        {
            int mid = start + (end - start) / 2;
            if(target<arr[mid])
                end = mid -1;
            else if(target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}