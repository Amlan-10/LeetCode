class Solution {
     int f(int ind, int amt, int coins[], int dp[][]) {
        if (ind == 0) {
            if (amt % coins[ind] == 0)
                return 1;
            else
                return 0;
        }

        if (dp[ind][amt] != -1)
            return dp[ind][amt];

        int not = f(ind - 1, amt, coins, dp);
        int take = 0;
        if (coins[ind] <= amt)
            take =  f(ind, amt - coins[ind], coins, dp);

        return dp[ind][amt] = take + not;
    }

   
    public int change(int amt, int[] coins) {
         int n = coins.length;
        int dp[][] = new int[n][amt + 1];
        for (int row[] : dp)
            Arrays.fill(row, -1);

        return f(n - 1, amt, coins, dp);
    }

}