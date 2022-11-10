package Searching;

import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter to find its valid perfect square::");
        int n = in.nextInt();
        System.out.println(isPerfectSquare(n));
    }
        public static boolean isPerfectSquare(int num) {
            if(num < 2) return true;
            long i=1;
            while(i*i<num)
            {
                i+=1;
                if(i * i == num) return true;

            }
            return false;
        }
}
