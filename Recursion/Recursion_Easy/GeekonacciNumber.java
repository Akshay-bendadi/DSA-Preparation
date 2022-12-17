package Recursion_Easy;

import java.util.*;
import java.lang.*;

class GeekonacciNumber
{
    public static void main (String[] args) {
        //code
      Scanner sc = new Scanner(System.in);
//      How many times geekonacci number going to be find
//        it take the value and runs loop that many times
      int loop = sc.nextInt();
      while(loop > 0)
      {
//          first number
          int A = sc.nextInt();
//          second number
          int B = sc.nextInt();
//          three number
          int C = sc.nextInt();
//          geekonacci Number on Nth place
          int N = sc.nextByte();
          loop--;
          System.out.println(giconacci(A, B, C, N, 1));
      }
    }
    static int giconacci(int A,int B,int C,int N,int i)
    {
        if(i==N-3)
        {
            return A+B+C;
        }
        return giconacci(A,B,A+B+C,N,i+1);
    }
}




