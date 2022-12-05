package String_Easy;
//https://leetcode.com/problems/goal-parser-interpretation/description/
public class GoalParserInterpretation {
    public static void main(String[] args) {
        String str = "G()()()()(al)";
        System.out.println(interpret(str));
    }
    static String interpret(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == 'G')
            {
                sb.append("G");
            }
            else if (ch  == '(' && str.charAt(i+1) == ')')
            {
                sb.append("o");
                i++;
            }
            else
            {
                sb.append("al");
                i+=3;
            }
        }
        return sb.toString();
    }
}
