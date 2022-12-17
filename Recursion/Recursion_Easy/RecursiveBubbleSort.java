package Recursion_Easy;

//https://www.geeksforgeeks.org/recursive-bubble-sort/

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,7};
        int n = arr.length;
        bubblesort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr,int n)
    {
        if(n == 1)
        {
            return;
        }
       for (int i = 0; i < n -1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
       bubblesort(arr,n-1);
    }
}
