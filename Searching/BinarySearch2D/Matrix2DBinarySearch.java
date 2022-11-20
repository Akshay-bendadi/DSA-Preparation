package BinarySearch2D;

import java.util.Arrays;

public class Matrix2DBinarySearch {
    public static void main(String[] args) {
//  here, the matrix is sorted by row amd column
        int[][] matrix = {
                {1,5,9,13},
                {2,6,10,14},
                {3,7,11,15},
                {4,8,12,16}
        };
        int target = 12;
        System.out.println(Arrays.toString(BinarySearch(matrix,target)));
    }
    static int[] BinarySearch(int[][] matrix , int target){
        int row = 0;
        int column = matrix.length - 1; // it stores the first array length;
        while(row < matrix.length &&  column >= 0)
        {
            if(matrix[row][column] == target)
            {
                return new int[] {row,column};
            }
            if(matrix[row][column] < target)
            {
                row++;      // if the row's top most element is smaller than target
//                            increment the row
            }
            else {
                column--;   // if the column's last most element is greater than target
//                            Decrement the column
            }
        }
        return new int[] {-1,-1};
    }
}
