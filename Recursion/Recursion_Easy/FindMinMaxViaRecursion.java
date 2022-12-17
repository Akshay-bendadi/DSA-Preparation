package Recursion_Easy;

//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

public class FindMinMaxViaRecursion {
    public static void main(String[] args) {
        int[] arr = {4,2,7,12};
        int length = arr.length;
        System.out.println("Minimum value is " + findmin(arr,length));
        System.out.println("Maximum value is " + findmax(arr,length));
    }
    static int findmin(int[] arr,int length)
    {
        if(length == 1)
        {
            return arr[0];
        }
        return Math.min(arr[length-1],findmin(arr,length - 1));
    }


    static int findmax(int[] arr,int length)
    {
        if(length == 1)
        {
            return arr[0];
        }
        return Math.max(arr[length-1],findmin(arr,length - 1));
    }
}
