package Sorting_Easy;
//https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//      note:-Given two integer arrays nums1 and nums2, return an array of their intersection.
//      Each element in the result must be unique and you may return the result in any order.

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,8};
        System.out.println(Arrays.toString(intersectionArrays(arr1,arr2)));
    }
    static int[] intersectionArrays(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<Integer>();
        int m = nums1.length;
        int n = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

//  Easy way but more time Complexity O(m*n) takes the loops
// Approach 1 :- it's time complexity is O(m*n)'

        //  for(int i = 0 ;i < nums1.length ; i++ )
        //  {
        //      for(int j = 0; j < nums2.length ; j++)
        //      {
        //         if(nums1[i] == nums2[j])
        //         {
        //             intersection.add(nums1[i]);
        //         }
        //     }
        //  }


// reduced  time complexity of above logic
// Approach 2 :-

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
//        It will common in both the approaches
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int k : intersection) {
            result[index] = k;
            index++;
        }
        return result;
    }
}