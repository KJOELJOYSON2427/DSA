class Solution {
    public int knapsack(int[] weight, int[] profit, int spaceLeft, int currentItem, int [][] dp) {

        // base cases
        if (currentItem == 0 || spaceLeft == 0) {
            return 0;
        }

        if(dp[currentItem][spaceLeft]!=-1){
            return dp[currentItem][spaceLeft];
        }
        int result;
        // recurrence relation
        if (weight[currentItem - 1] <= spaceLeft) {
            result= Math.max(
                profit[currentItem - 1] + knapsack(weight, profit, spaceLeft - weight[currentItem - 1], currentItem - 1, dp),
                knapsack(weight, profit, spaceLeft, currentItem - 1,dp)
            );
        } else {
            result= knapsack(weight, profit, spaceLeft, currentItem - 1,dp);
        }

        dp[currentItem][spaceLeft] = result;
        return result;
    }




     public int table(int[] weight, int[] profit, int spaceLeft, int currentItem) {
        int capacity = 7;

        int n = weight.length;
         int [][] dp = new int[n+1][capacity+1];
          for (int j = 0; j< dp.length; j++) {
            for (int i = 0; i < capacity+1; i++) {
                 dp[j][i]=-1;
            }
        }

        for (int i = 0; i < capacity+1; i++) {
            dp[0][i]=0;
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < capacity+1; j++) {
                if(weight[i-1] <= j){
                       dp[i][j]= Math.max(dp[i-1][j], profit[i-1]+dp[i-1][j-weight[i-1]]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][capacity];
     }
}

public class knapsack {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] weight = { 1, 3, 4, 5 };
        int[] profit = { 1, 4, 5, 7 };
        int capacity = 7;

        int n = weight.length; // number of items
        int [][] dp = new int[n+1][capacity+1];
        for (int j = 0; j< dp.length; j++) {
            for (int i = 0; i < capacity+1; i++) {
                 dp[j][i]=-1;
            }
        }
        int maxProfit = sol.table(weight, profit, capacity, n);

        System.out.println("Maximum Profit = " + maxProfit);
    }
}
