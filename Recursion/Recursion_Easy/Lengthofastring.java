package Recursion_Easy;

//https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/

public class Lengthofastring {
    public static void main(String[] args) {
        String str = "hellofriends";
        System.out.println(findlength(str));
    }
    static int findlength(String str)
    {

        if (str.isEmpty()) {
            return 0;
        } else {
            return 1 + findlength(str.substring(1));
        }

    }
}
