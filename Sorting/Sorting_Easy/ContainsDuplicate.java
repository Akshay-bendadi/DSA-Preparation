package Sorting_Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {6,4,9,6,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Duplicate(arr));
    }
    static boolean Duplicate(int[] arr)
    {
        Set<Integer>  set = new HashSet<>();
        for(int n : arr)
        {
            if(set.add(n) != true)
            {
                return false;
            }
        }
        return true;
    }
}
