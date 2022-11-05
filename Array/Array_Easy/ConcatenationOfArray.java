package Array_Easy;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int x = nums.length;
        var result=new int[nums.length*2];
        for (int i = 0; i < x; i++) {
            result[i] = nums[i];
            result[i + x] = nums[i];
        }
        return result;
    }
}

