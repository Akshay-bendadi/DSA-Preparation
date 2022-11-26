package Sorting_Easy;

import java.util.Arrays;

//https://leetcode.com/problems/sort-array-by-parity/description/
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    private static int[] sortArrayByParity(int[] arr)
    {
        int n = arr.length - 1;
        for (int i = 0; i < n; ) {
            if(arr[i] % 2 == 1)
            {
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
                n--;
            }
            else
            {
                i++;
            }
        }
        return arr;
    }
}
