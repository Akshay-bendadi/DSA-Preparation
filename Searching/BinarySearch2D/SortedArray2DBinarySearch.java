package BinarySearch2D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedArray2DBinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {15,45,67},
                {3,14,29},
                {55,81,90}
        };
        System.out.println(Arrays.toString(search(matrix,81)));
    }
//      Search in the provided row to column
    static int[] BinarySearch(int[][] matrix, int row, int columnStart, int columnEnd, int target)
    {
        while(columnStart <= columnEnd)
        {
            int mid =  columnStart + (columnEnd - columnStart) / 2;
            if(matrix[row][mid] == target)
            {
                return new int[] {row,mid};
            }
            if(matrix[row][mid] < target)
            {

                columnStart = mid + 1;
            }
            else {
                columnEnd = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] matrix,int target)
    {
        int row = matrix.length;
        int column = matrix[0].length;

        if(row == 1)
        {
            return BinarySearch(matrix,0,0,column-1,target);
        }
        int rowStart = 0;
        int rowEnd = row - 1;
        int columnMid = column / 2;
//        run the loop till 2 rows are remaining
        while(rowStart < (rowEnd - 1))
        {       // while it is true it will have more than it have more than 2 rows
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if(matrix[mid][columnMid] == target)
            {
                return new int[] {mid,columnMid};
            }

            if(matrix[mid][columnMid] < target)
            {
                rowStart = mid;
            }
            else
            {
                rowEnd = mid;
            }
        }

//        After loop end we are having 2 rows
//        Check whether the target is in the column of 2 rows
        if(matrix[rowStart][columnMid] == target)
        {               // it will check first rows middle element is target.
            return new int[] {rowStart,columnMid};
        }
        if(matrix[rowStart + 1][columnMid] == target)
        {                // it will check Second rows middle element is target.
            return new int[] {rowStart + 1,columnMid};
        }


//       if target doesn't found in the middle off the row
//       when we don't  found target in the middle of the row than we have to check it in  4 half


//            1st half of 1st row's left part
        if(target <= matrix[rowStart][columnMid - 1] )
        {
            return BinarySearch(matrix,rowStart,0,columnMid-1,target);
        }
//            2nd half of 1st row's right part
        if(target >= matrix[rowStart][columnMid + 1] && target <= matrix[rowStart][column - 1])
        {
            return BinarySearch(matrix,rowStart,columnMid+1,column - 1,target);
        }
//            3rd half of 2nd row's left part
        if(target <= matrix[rowStart + 1][columnMid - 1])
        {
            return BinarySearch(matrix,rowStart + 1,0,columnMid-1,target);
        }
        else //            4th half of 2nd row's right part
        {
            return BinarySearch(matrix,rowStart+1,columnMid + 1,column - 1,target);

        }

    }
}
