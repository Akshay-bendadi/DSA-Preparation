package Array_Easy;

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
            int even=0;
            for(int i=0;i<nums.length;i++)
            {
                int count=0;
                while(nums[i]!=0)
                {
                    nums[i]/=10;    //it removes one by one digits from the Number
                    count++;        // it counts how many digit number it is
                }
                if(count%2==0) even++;  //it cheaks Number is even or not;
            }
            return even;        //it returns all the even digits numbers count
        }
}
