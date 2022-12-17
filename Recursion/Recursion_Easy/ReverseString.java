package Recursion_Easy;

import java.util.Arrays;

//https://leetcode.com/problems/reverse-string/description/

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','0'};
        reverse(s);
    }
    static void reverse(char[] s) {
        int start = 0;
        int end = s.length - 1;
        swap(s,start,end);
        System.out.println(Arrays.toString(s));
    }
    static void swap(char[] s,int start,int end)
    {
        if(start > end)
        {
            return;
        }
        else{
            char temp;
            temp = s[start];
            s[start] = s[end];
            s[end]=temp;
        }
        swap(s,start+1,end-1);
    }
}
