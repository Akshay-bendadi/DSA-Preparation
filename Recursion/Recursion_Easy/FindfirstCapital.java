package Recursion_Easy;

//https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/

public class FindfirstCapital {
    public static void main(String[] args) {
        String str = "Hello People";
        int len = str.length() - 1;
        System.out.println("First Capital character is "+ capital(str,len));
    }
    static char capital(String str,int len)
    {
        if(Character.isUpperCase(str.charAt(len)))
        {
            return str.charAt(len);
        }
        return capital(str,len-1);
    }
}
