package Array_Easy;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] candies = {12,5,13,21,6,54,18};
        int extra_candy=4;
        System.out.println(kidsWithCandies(candies,extra_candy));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            ArrayList<Boolean> result = new ArrayList<Boolean>();
            int max=candies[0];
            for(int i=1;i<candies.length;i++)
            {
                if(candies[i]>max) max=candies[i];
            }
            for(int i=0;i<candies.length;i++)
            {
                if(candies[i]+extraCandies>= max)
                    result.add(true);
                else result.add(false);
            }
            return result;
        }
}
