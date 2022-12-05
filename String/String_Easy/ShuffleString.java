package String_Easy;
//https://leetcode.com/problems/shuffle-string/description/
public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(str,indices));
    }
    static String restoreString(String str,int[] indices){
        char[] ch = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            ch[indices[i]] = str.charAt(i);
        }
        return new String(ch);
    }
}
