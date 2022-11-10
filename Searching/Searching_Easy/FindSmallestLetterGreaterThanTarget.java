package Searching;

import java.util.Scanner;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','e','i','k','p'};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter ::");
        String ch = in.next();
        System.out.printf("Smallest letter that is greater than the target is ::  " + nextGreatestLetter(letters,ch.charAt(0)));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if(letters[mid] > target)
                end = mid -1;
            else
                start = mid + 1;
        }
        return letters[start % letters.length];
    }
}

