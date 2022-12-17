package Recursion_Easy;

//https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

public class Print1ToNWithoutLoop {
    public static void main(String[] args) {
        int n  = 5;
        printNo(n);
    }
    static void printNo(int n)
    {
        if(n == 1)
        {
            System.out.print(n+" ");
            return;
        }
        printNo(n - 1);
        System.out.print(n+" ");
    }
}
