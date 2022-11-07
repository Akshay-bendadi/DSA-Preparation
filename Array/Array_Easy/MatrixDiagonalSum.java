package Array_Easy;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {4,5,4},
                {3,4,3},
                {2,3,2}

        };
        System.out.println(diagonalSum(matrix));
    }
    public static int diagonalSum(int[][] mat) {
            int n = mat.length;
            int sum=0;
            for(int i = 0; i <mat.length; i++)
            {
                sum+=mat[i][i];
                sum+=mat[i][n-1-i];
            }
            return (n%2==0) ? sum : sum-mat[n/2][n/2];
        }
}