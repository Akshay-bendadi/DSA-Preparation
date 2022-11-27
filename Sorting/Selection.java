package SelectionSort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {4,8,1,2,-1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
//         find the max item in the remaining array and swap with correct index
           int last = arr.length - i - 1;   //IT WILL COME CLOSER TO THE FIRST ELEMENT
           int maxIndex = getMaxElement(arr,0,last);    // IT STORES MAXIMUM ARRAY ELEMENT'S INDEX
            swap(arr,maxIndex,last);    // IT SWAPS ARRAY MAX ELEMENT AT LAST AND
            }
        }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];      // IT SWAP ARRAY LAST ELEMENT WITH THE WHERE THE MAX ELEMENT FOUND
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxElement(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;  //IT WILL RETURN THE MAXIMUM ELEMENT'S INDEX
    }
}
