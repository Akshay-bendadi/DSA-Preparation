package Array_Easy;
public class CountItemsMatchingRule
{
    public static void main(String[] args) {
        String[][] arr2 = {
                {"phone","red","pixel"},    //0th index
                {"computer","silver","lenovo"},    //1th index
                {"phone","silver","iphone"} };    //2th index
                String rulekey="type";
                String rulevalue="phone";
                System.out.print(countMatches(arr2,rulekey,rulevalue));
    }
    public static int countMatches(String[][] items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if(ruleKey=="type" & items[i][0]==ruleValue) count++;
            else if (ruleKey=="color" & items[i][1]==ruleValue) count++;
            else{
                if (ruleKey=="name" & items[i][2]==ruleValue) count++;

            }
        }
                return count;
    }
}
