//          Input: gain = [-5,1,5,0,-7]
//        Output: 1
//        Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
//  resultant array sizeis exisiting array length + 1
// resulting array 0th index should be zero
package Array_Easy;
public class FindHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,9,0,-7};
        System.out.println(largestAltitude(gain));
    }

    private static int largestAltitude(int[] gain) {
    int[] result = new int[gain.length+1];
    result[0]=0;   // As mentioned add resultant string 0th index value 'zero/0'
    int max=result[0];
    for(int i=1;i<=gain.length;i++)
    {
        result[i]=result[i-1]+gain[i-1];
        if(result[i]>max) max=result[i];
    }
        return max;
    }
}
//Working of for loop
//result[0]=0
//i=1  gain:[-5,1,9,0,-7]  result[0,-5,0,0,0,0]
//i=1  gain:[-5,1,9,0,-7]  result[0,-5,-4,0,0,0]
//i=1  gain:[-5,1,9,0,-7]  result[0,-5,-4,5,0,0]
//i=1  gain:[-5,1,9,0,-7]  result[0,-5,-4,5,5,0]
//i=1  gain:[-5,1,9,0,-7]  result[0,-5,-4,5,5,0]