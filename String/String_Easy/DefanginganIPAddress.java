package String_Easy;

//https://leetcode.com/problems/defanging-an-ip-address/description/

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class DefanginganIPAddress
{
    public static void main(String[] args) {
        String str = "1.1.1.1";
        System.out.println(defangIPaddr(str));
    }

    public static String defangIPaddr(String str)
    {
        if(str == null || str.length() < 0)
            return str;
        return str.replace(".","[.]");
    }
}
