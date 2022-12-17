package Recursion_Easy;

//https://www.geeksforgeeks.org/sum-triangle-from-array/

import java.util.Arrays;

public class Sumtrianglefromarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        SumTriangle(arr);
    }
    static void SumTriangle(int[] arr)
    {
//        condition if array length is o then its having only one value so we can sum it by itself
//        it  is the base condition to break the recursive calls when array length goes less than 1
        if(arr.length < 1)
        {
            return;
        }
//        Temporary array for storing Sum of triangle, and it's size will always the original array minus one
//        arrays are mutable so when we decrease the temporary array size it will reduce originals too
        int[] temp = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++)
        {
                temp[i] = arr[i] + arr[i+1];
//                Storing the sum of values in temporary array
        }
//        Recursive calls and passes the newly created array
//        Every recursive function will have the new temp array
        SumTriangle(temp);

//        it will print the last recursive function array to first
//        Because every method is stored in the stack and stack works in LIFO manner
        System.out.println(Arrays.toString(arr));
    }
}
