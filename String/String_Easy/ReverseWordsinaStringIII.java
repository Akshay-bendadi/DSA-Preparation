package String_Easy;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s){
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s1: str)
        {
         StringBuilder temp = new StringBuilder();
         temp.append(s1);
         sb.append(temp.reverse());
         sb.append(" ");
        }
     sb.setLength(s.length());
        return sb.toString();
    }
}
