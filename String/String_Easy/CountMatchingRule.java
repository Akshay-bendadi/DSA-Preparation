package String_Easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/

    public class CountMatchingRule
    {
        public static void main(String[] args) {

            //             ruleKey == "type" and ruleValue == typei.
            //            ruleKey == "color" and ruleValue == colori.
            //            ruleKey == "name" and ruleValue == namei.

//            created 2D list
            List<List<String>> ls = new ArrayList<>();
            List<String> ls1 = new ArrayList<>();
            ls1.add("phone");
            ls1.add("blue");
            ls1.add("pixel");
            ls.add(ls1);

            List<String> ls2 = new ArrayList<>();
            ls2.add("computer");
            ls2.add("silver");
            ls2.add("lenovo");
            ls.add(ls2);

            List<String> ls3 = new ArrayList<>();
            ls3.add("phone");
            ls3.add("gold");
            ls3.add("iphone");
            ls.add(ls3);

//            key and key values for counting how many times the value is present
            String rulekey = "type";
            String rulevalue = "phone";

            System.out.println(countMatches(ls,rulekey,rulevalue));

        }
        static int countMatches(List<List<String>> ls,String rulekey,String rulevalue)
        {
            int count = 0;
            for(int i=0;i<ls.size();i++)
            {
                if(rulekey == "type")
                {
                    if (ls.get(i).get(0).equals(rulevalue))
                        count++;        //  it will cheak in array [0,0],[1,0],[2,0]
                }
                if(rulekey == "color")
                {
                    if (ls.get(i).get(1).equals(rulevalue))
                        count++;        //  it will cheak in array [0,1],[1,1],[2,1]
                }
                else
                {
                    if(ls.get(i).get(2).equals(rulevalue))
                        count++;        //  it will cheak in array [0,2],[1,2],[2,2]
                }
            }
            return count;
        }
    }



