package Searching;

public class GuessNumberHigherorLower {
    static int n = 10;
    public static void main(String[] args) {
        System.out.println(guessNumber(n));
    }

    static int  guess(int mid) {
        if(n > mid)
            return -1;
        else if (n<mid)
            return 1;
        else
            if(n==mid) return 0;
    return 2;
    }

    public static int guessNumber(int n) {
            int left = 1, right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                int guess = guess(mid);
                if (guess == 0) return mid;
                else if (guess == -1) right = mid - 1;
                else left = mid + 1;
            }

            return right;
        }
    }
