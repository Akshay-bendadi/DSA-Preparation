package Sorting_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,2};
        int[] arr2 = {2,2,8};
        System.out.println(Arrays.toString(intersectionArrays2(arr1,arr2)));
    }
    static int[] intersectionArrays2(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        int m = nums1.length;
        int n = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
//        It will common in both the approaches
        int[] result = new int[list.size()];
        int index = 0;
        for (int k : list) {
            result[index] = k;
            index++;
        }
        return result;
    }
}
