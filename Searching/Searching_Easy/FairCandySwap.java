package Searching;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] arr = {2};
        int[] arr2 = {1,3};
        System.out.println(Arrays.toString(fairCandySwap(arr,arr2)));
    }
    public static int[] fairCandySwap(int[] alice, int[] bob) {
            int suma=0,sumb=0;
            for(int i=0;i<alice.length;i++)
                suma+=alice[i];

            for(int j=0;j<bob.length;j++)
                sumb+=bob[j];

            int diff = (suma -sumb)/2;

            for(int i=0;i<alice.length;i++)
                for(int j=0;j<bob.length;j++)
                    if(alice[i] - bob[j]==diff)
                        return new int[]{alice[i],bob[j]};
            return null;
        }
}
