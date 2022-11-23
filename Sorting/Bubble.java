import java.util.Arrays;

public class Bubble {
//    it's also called inplace algorithm or exchange sort
//best case O(n)
//worst case O(n^2)
    public static void main(String[] args)
    {
        int[] arr1 = {-1,-4,-3,-7,-9};
        int[] arr2 = {2,5,4,1,3};
        bubble(arr1);
        bubble(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

    private static void bubble(int[] arr1) {
        boolean swapped;
        for(int i=0;i<arr1.length;i++)
        {
            swapped = false;
            for(int j=1;j<arr1.length - i;j++)
            {
                if(arr1[j] < arr1[j-1])
                {
                    int temp = arr1[j];
                    arr1[j] = arr1[j-1];
                    arr1[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}