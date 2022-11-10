package Searching;

import java.util.Scanner;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println("Enter kth index to searched :: ");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println(findKthPositiveValue(arr,k));
    }

    private static int findKthPositiveValue(int[] arr, int k) {
        int n = 1;
        int index = k;
        for(int i=0;i<arr.length;n++)  //here n holds the present number should be present in the array
        {
            if(arr[i]==n)  //if nth value and arr[i] value matches then go to next array value
            {
                i++;    //if nth value and arr[i] value matches then go to next array value
            }
            else{   // condition  wrongs
                index-=1;    // decrement the k
                if(index == 0)  //when n comes to the finding missing index
                    return n;  // return the n;
            }
        }
        return n+(index-1);
    }
}
