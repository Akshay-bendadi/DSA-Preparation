package Searching;

import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n=in.nextInt();
        System.out.println("last fully arranged coin index is ::" + arrangeCoins(n));
    }
        public static int arrangeCoins(int n){
            int count = 0;
            int step = 1;
            while (n > 0) {
                if (n - step >= 0) {
                    count++;
                    n -= step;
                    step++;
                } else
                    break;
            }
            return count;
        }
    }
