package Array_Easy;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},{4, 5, 6},{7, 8, 9}
        };
        int[][] result = transpose(matrix);
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");}
    }
        public static int[][] transpose(int[][] matrix) {
            int[][] result = new int[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[i].length; j++)
                    result[j][i] = matrix[i][j];
            return result;
        }
}
