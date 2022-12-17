package Recursion_Easy;

//https://leetcode.com/problems/fibonacci-number/solutions/?orderBy=most_relevant

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibo(n));
    }
    static int fibo(int n)
    {
        if(n < 2)
        {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
