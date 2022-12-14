public class Pattern_16_35 {
    public static void main(String[] args) {
        int n = 5;

        pattern27(n);
    }
    static void pattern16(int n)
    {
        System.out.println("pattern 16:-");
        int  num = 1;
        for (int i = 0; i < n; i++)
        {
            for (int j = n-i; j > 1; j--)
            {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++)
            {
                if (j == 0 || i == 0)
                    num = 1;
                else
                    num = num*(i-j+1)/j;
                System.out.print(num+"   ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n)
    {
        System.out.println("pattern 17:-");
        for (int row = 0; row < 2 * n; row++)
        {
            int c = row > n ? 2* n - row : row;
            for (int space = 0; space < n - c; space++)
            {
                System.out.print("  ");
            }
            for (int col = c; col >= 1 ; col--)
            {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++)
            {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n)
    {
        System.out.println("pattern 18:-");
        for (int row = n * 2; row >= 1; row--)
        {
            int c = row > n ? row - n : n - row + 1;

            for (int col = 1; col <= c ; col++)
            {
                System.out.print("*" + " ");
            }
            for (int space =  1; space <= n - c; space++)
            {
                System.out.print("  ");
            }
            for (int space =  n-c; space >= 1; space--)
            {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }

    static void pattern19(int n)
    {
        System.out.println("pattern 19:-");
        for(int row = 1 ; row <= 2 * n ; row++)
        {
            int c= row > n ? 2 * n - row : row;
            for (int j = 1; j <=c ; j++)
            {
                    System.out.print("*");

            }
            for (int space = 1; space <=n-c; space++)
            {
                System.out.print("  ");
            }
            for (int col = c; col >=1 ; col--) {

                    System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern20(int n)
    {
        System.out.println("pattern 20:-");
        for (int row=1; row<=5; row++)
        {
            for (int col=1; col<n; col++)
            {
                if (row==1 || row==n || col==1 || col == n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern21(int n)
    {
        System.out.println("pattern 21:-");
        int sum = 1;
        for (int row = 1; row <= n; row++)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print(sum + " ");
                sum=sum+1;
            }
            System.out.println();
        }
    }

    static void pattern22(int n)
    {
        System.out.println("pattern 22:-");
        int sum = 0;
        for (int row = 1; row <= n; row++)
        {
            if ( row % 2 == 0)
                sum=0;
            else
                sum=1;
            for (int col = 1; col <= row; col++)
            {
                if(sum == 1)
                {
                    System.out.print(sum + " ");
                    sum = 0;
                }
                else
                {
                    System.out.print(sum + " ");
                    sum = 1;
                }
            }
            System.out.println();
        }
    }

    static void pattern24(int n)
    {
        System.out.println("pattern 24:-");

        for(int i = 1 ; i <= 2 * n ; i++)
        {
            int c= i > n ? 2 * n - i : i;
            for (int j = 1; j <=c ; j++)
            {
                if (j==1 || j == c) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <=n-c; j++)
            {
                System.out.print("  ");
            }
           for (int j = c; j >=1 ; j--) {
               if (j == 1 || j == c) {
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
           }
            System.out.println();
        }
    }

    static void pattern25(int n)
    {
        for(int i = 1;i <= n ; i++)
        {
            for(int k = 1; k<= n-i ; k++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++)
            {
                if (i==1 || i==n || j==1 || j == n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern26(int n)
    {
        int sum = 0;
        for (int i = n; i >= 1 ; i--)
        {
            sum += 1;
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    static void pattern27(int n)
    {
        n = 4;
        int count = 1;

        // Iterate through each row
        for (int i = 0; i < n; i++)
        {
            // Iterate through each column
            for (int j = 0; j < n; j++)
            {
                // If row number is greater than
                // column number
                if (i > j) {
                    System.out.print("  ");
                } else {
                    // Print the number
                    System.out.print(count + " ");
                    count++;
                }
            }

            if (i % 2 == 0)
                count = count + (n - 1);
            else
                count = count + (n + 1);

            System.out.println();
        }
    }

    static void pattern28(int n)
    {
        for (int row = 1; row < 2 * n ; row++)
        {
            int c = row > n ? 2 * n - row : row;
            for (int space = 1; space <= n - c ; space++)
            {
                System.out.print(" ");
            }
            for (int col = 1; col <= c; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern29(int n)
    {
        for (int row = 1; row < 2 * n; row++)
        {
            int c = row > n ? 2 * n - row : row;
            for (int col = 1; col <= c; col++)
            {
                System.out.print("*");
            }
            for (int space = 1; space <= n - c ; space++)
            {
                System.out.print("  ");
            };
            for (int col = c; col >= 1; col--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern30(int n)
    {
        for (int row = 1; row <= n; row++)
        {
            int c = n - row;
            for (int space = 1; space <=c ; space++)
            {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--)
            {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n)
    {
        int originalN = n;
        n = n*2-1;
        for (int row = 1; row <= n; row++)
        {
            for (int col = 1; col <= n; col++)
            {
                int c = originalN - Math.min(Math.min(row-1,col-1),Math.min(n-row,n-col));
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void pattern32(int n)
    {
        for(int row=n; row>=1; row--)
        {
            for(int col=row; col<=n; col++)
            {
                System.out.print((char)(col+64)+" ");
            }
            System.out.println();
        }
    }
    static void pattern33(int n)
    {
        int count = 1;
        char ch = 'a';
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                if(count%2!=0) {
                    System.out.print((char) (ch++) + " ");
                }
                else {
                    System.out.print((char) (ch++ - 32) + " ");
                }
                count++;
            }
            System.out.println();
        }
    }

    static void pattern34(int n)
    {
        for(int row=n; row>=1; row--)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print((char)(row + 65 - col)+" ");
            }
            System.out.println();
        }
    }
    static void pattern35(int n)
    {
        for (int row = 1; row <=n ; row++)
        {
            for (int col = 1; col <=row ; col++)
            {
                System.out.print(col+" ");
            }
            for (int space = 1; space <= 2 * (n - row) ; space++)
            {
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--)
            {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }
}
