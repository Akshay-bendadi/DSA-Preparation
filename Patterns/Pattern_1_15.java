
public class Pattern_1_15 {
    public static void main(String[] args)
    {
        int n = 5;

        pattern15(n);
    }

    static void pattern1(int n)
    {
        System.out.println("pattern 1:-");
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n)
    {
        System.out.println("pattern 2:-");
        for (int i = 1; i <=n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n)
    {
        System.out.println("pattern 3:-");
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n)
    {
        System.out.println("pattern 4:-");
        for (int i = 1; i <=n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n)
    {
        System.out.println("pattern 5:-");
        for(int i = 1 ; i < 2 * n ; i++)
        {
            int totalcolumntoprint = i > n ? 2 * n - i : i;
            for (int j = 1; j <= totalcolumntoprint ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern6(int n)
    {
        System.out.println("pattern 6:-");
        for(int i = 1 ; i <= n ; i++)
        {
            int noofspaces =n - i;
            for(int k = 1 ; k <= noofspaces ; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n)
    {
        System.out.println("pattern 7:-");
        for(int i = n ; i >= 1 ; i--)
        {
            int noofspaces = n - i;
            for(int k = 1 ; k <= noofspaces ; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern8(int n)
    {
        System.out.println("pattern 8:-");
        for(int i = 1 ; i <= n ; i++)
        {
            int noofspaces = n- i;
            for (int k = 1; k <=noofspaces ; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            for (int l = 2; l <=i ; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n)
    {
        System.out.println("pattern 9:-");
        for(int i = n ; i >= 1 ; i--)
        {
            int noofspaces = n- i;
            for (int k = 1; k <=noofspaces ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int l = 2; l <=i ; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n)
    {
        System.out.println("pattern 10:-");
        for(int i = 1 ; i <= n ; i++)
        {
            int noofspaces =n - i;
            for(int k = 1 ; k <= noofspaces ; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n)
    {
        System.out.println("pattern 11:-");
        for(int i = n ; i >= 1 ; i--)
        {
            int noofspaces =n - i;
            for(int k = 1 ; k <= noofspaces ; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.   out.println();
        }
    }

    static void pattern12(int n)
    {
        System.out.println("pattern 12:-");
        for(int row = n * 2; row >= 1 ; row--)
        {
            int c = row > n ? row - n : n - row + 1  ;
            for(int k = 1 ; k <= n - c ; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern13(int n)
    {
        System.out.println("pattern 13:-");
        for(int i = 1 ; i <= n ; i++)
        {
            int noofspaces = n- i;
            for (int k = 1; k <=noofspaces ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if (j == i) {
                    System.out.print("*");
                }
                else if (i==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int l = 2; l <=i ; l++) {
                if (l == i) {
                    System.out.print("*");
                }
                else if (i == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n)
    {
        System.out.println("pattern 14:-");

        for(int i = n ; i >= 1 ; i--)
        {
            int noofspaces = n- i;
            for (int k = 1; k <=noofspaces ; k++)
            {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--)
            {
                if (j == i) {
                    System.out.print("*");
                }
                else if (i==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int l = 2; l <=i ; l++)
            {
                if (l == i) {
                    System.out.print("*");
                }
                else if (i == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern15(int n)
    {
        System.out.println("pattern 15:-");
        for(int i = 1 ; i <= n ; i++)
        {
            int noofspaces = n- i;
            for (int k = 1; k <=noofspaces ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if (j == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int l = 2; l <=i ; l++) {
                if (l == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1 ; i--)
        {
            int noofspaces = n- i;
            for (int k = 1; k <=noofspaces ; k++)
            {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--)
            {
                if (j == i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int l = 2; l <=i ; l++)
            {
                if (l == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
