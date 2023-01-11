link : 

class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount < 0 || coins.length == 0 || coins == null){
            return 0;
        }
        int[] dp = new int[amount+1];
        // filling the dp array with max value, lets say amount = 7, filling it with 7+1, as it wont cross that much anyway
        Arrays.fill(dp,amount+1);
        dp[0] = 0;

        //for dp[2] we will be checking with each coin (2nd loop) dp[2-each coin] -- to get the min using previous ones dp[i-coin] --> again checks the min of all to achieve the amount  
        for (int i = 0 ; i <= amount ; i++){
            for( int  coin : coins){
                if( i - coin >= 0){
                    dp[i] = Math.min(dp[i], 1 + dp[i-coin]);
                }
            }
        }

        return dp[amount] != amount+1 ? dp[amount] : -1; 
    }
}
