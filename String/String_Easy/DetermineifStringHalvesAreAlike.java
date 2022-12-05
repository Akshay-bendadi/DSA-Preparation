package String_Easy;

public class DetermineifStringHalvesAreAlike {
    public static void main(String[] args) {
        String s ="book";
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s)
    {
        int mid = s.length() / 2;
        int count = 0;
        int count1 = 0;
        for (int i = 0;i<mid;i++)
        {
            if(cheakvowel(s.charAt(i)))
            {
                count++;
            }
            if(cheakvowel(s.charAt(mid + i)))
            {
                count1++;
            }
        }
        return count == count1 ? true : false;
    }
    static boolean cheakvowel(char ch)
    {
        char ch1 = Character.toLowerCase(ch);

        return ch1 == 'a' || ch1 == 'e' ||ch1 == 'i'||ch1 == 'o'||ch1 == 'u';
    }
}
