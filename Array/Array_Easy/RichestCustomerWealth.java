package Array_Easy;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(maximumWealth(arr));
    }
        public static int maximumWealth(int[][] accounts) {
            int result=0;
            for(int i=0;i<accounts.length;i++)
            {
                int  temp_result=0;
                for(int j=0;j<accounts[i].length;j++)
                {
                    temp_result+=accounts[i][j];
                }
                if(temp_result>result) result=temp_result;
            }
            return result;

    }
}
