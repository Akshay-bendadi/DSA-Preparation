package interviewQBS;

public class FindElementInInfiniteArray {
    public static void main(String[] args) {
//         Here we don't know the size of the array because it's infinite
        int[] arr = {1,3,8,9,12,45,58,89,96,106,256,329,450,459,502,563};
        int target = 450;
        System.out.println(result(arr,target));
    }
    static int result(int[] arr, int target)
    {
//      here we're searching for where the target element lives
        int start = 0;
        int end = 1;
        while(target>arr[end])
        {
//         if don't found target in first condition we will double the size of the start and end move forward in array until  we find target
            int temp = end + 1; // temporary storing after end indexed next in temp so can find from the end's next index
                                // So we didn't do the same checks multiple times

            end = end + (end - start + 1) * 2; // it will point to the end's * 2 th index that acctually makes it double from previous search
            start = temp;   // it will start from where previous end's next index
        }
        return BinarySearch(arr,target,start,end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end)
    {
        // Simple Binary Search operation
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
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
}
