package Sorting_Easy;

import java.util.Arrays;
//https://leetcode.com/problems/sort-array-by-parity-ii/description/
public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayParityII(arr)));
    }

    static int[] sortArrayParityII(int[] arr) {
        int[] result = new int[arr.length];
        int odd = -1;
        int even = -2;
        for(int num : arr)
        {
            result[(num%2==0) ? (even+=2): (odd+=2)] = num;
        }
        return result;
    }
}
