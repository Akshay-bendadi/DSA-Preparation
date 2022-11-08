package Array_Easy;

import java.util.*;

public class AddArrayFormofInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        int k=34;
        System.out.println(addToArrayForm(arr,k)); //Function call
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> list = new ArrayList<>();  //arr [1,2,0,0] , k=34
            for(int i=num.length-1;i>=0;i--)  // ADD num[LAST INDEX] + k  --> 0 + 34 =  34 --> k'   ADD(4) to LIST
            {                                  //  Now ADD num[1] + (k' % 10) --> 0 + 3 = 3   --> k'   ADD(3) to LIST
                int sum = num[i]+k;            //  Now ADD num[0] + (k' % 10) --> 2 + 0 = 2     --> k'   ADD(2) to LIST
                list.add(sum%10);               // Now ADD num[0] + (k' % 10) --> 1 + 0 = 1     --> k'   ADD(1) to LIST
             k=sum/10;                          //  k = k' % 10 = 0
            }
            while(k>0)      // if k value is containing 2 digits then
            {
                list.add(k%10);  // remove each digit from the k's value and add into list
                k/=10;
            }
            Collections.reverse(list);  // reverses the list=[4,3,2,1] to [1,2,3,4]
            return list;
        }
}
