package interviewQBS;

public class PeakIndexinaMountainArray {
//    it is a mountain array                                                                                                2
//    because it's a combination of ascending order and descending order                                                 0     1
//    from beginning value is smaller than  its next element and after getting max element it's decreasing                       0
//    and present element will be greater than next element like this we can define mountain array
public static void main(String[] args)
    {
        int[] arr = {0, 2, 1, 0};
        System.out.print(BinarySearch(arr));
    }

    private static int BinarySearch(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
        while(start < end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])     //through this condition we can know that we in decreasing part of the array
            {                               // and arr[mid] element is max, but we have to check its previous element is smaller or bigger
                end = mid;                  // it its prev element is greater than current than it will make will be max and cross-check it again
            }
        else{                               //through this condition we can know that we in ascending part of the array
                                            // and arr[mid] element is max, but we have to check its next element is smaller or bigger
                start = mid + 1;            // it its next element is greater than current than it will make will be max and cross-check it again
            }
        }
    return start;                   // at the end of the both operation it comes to the max element and return its index
    }
}
