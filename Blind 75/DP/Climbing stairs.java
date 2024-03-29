class Solution {
    public int climbStairs(int n) {
        
        //using fibonacci logic
        // fibonacci solution starts here
        if(n == 1 ){
            return 1;
        }
        int first  = 1;
        int second = 2;
        for(int i = 3;i<= n;i++){
            int third = first + second ;
            first = second ;
            second = third;
        }
        return second;
         // fibonacci solution ends here
        
        
        // Using DP 
        // dp solution starts here
        int[] dp = new int[n+1];
        if (n == 1){
            return 1;
        }
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3 ; i <= n;i++){
            dp[i] = dp[i-1] + dp[i-2];
         }
         return dp[n];
        
        // dp solution ends here
    }
}
