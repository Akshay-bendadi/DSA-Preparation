package String_Easy;
//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/
public class NumberofStringsThatAppearasSubstringsinWord {
    public static void main(String[] args) {
        String[] str = {"a","abc","bc","d"};
        String word ="abc";
        System.out.println(numOfStrings(str, word));
    }
    static int numOfStrings(String[] str,String word)
    {
        int count = 0;

        for (String s : str)
        {
            if(word.contains(s))
            {
                count++;
            }
        }
        return count;
    }
}
