package Sorting_Easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1,3,5,0,0,0};
        int[] num2 = {2,4,6};
        int m = 3;
        int n = num2.length;
        merge(num1,m,num2,n);
        System.out.println(Arrays.toString(num1));
    }
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = 0; i < n; i++)
            {
                nums1[ m + i] = nums2[i];
            }
            for (int i = 0; i < nums1.length; i++)
            {
//         find the max item in the remaining array and swap with correct index
                int last = nums1.length - i - 1;   //IT WILL COME CLOSER TO THE FIRST ELEMENT
                int maxIndex = getMaxElement(nums1,0,last);    // IT STORES MAXIMUM ARRAY ELEMENT'S INDEX
                swap(nums1,maxIndex,last);    // IT SWAPS ARRAY MAX ELEMENT AT LAST AND
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
