package InsertionSort;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {-5,-52,7,5,-12};
        System.out.println(Arrays.toString(Selection(arr)));
    }
    static int[] Selection(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j > 0; j--)
            {
                    if(arr[j] < arr[j - 1])
                    {
                       int temp = arr[j];
                       arr[j] = arr[j - 1];
                       arr[j - 1] = temp;
                    }
                    else
                    {
                        break;
                    }
            }
        }
        return arr;
    }
}