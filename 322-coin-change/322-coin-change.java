class Solution {
    public int coinChange(int[] coins, int amount) {
        if(coins == null || coins.length == 0) return 0;
        
        int dp[][] = new int[coins.length+1][amount+1];
        
        int r =  coins.length+1;
        int c = amount+1;
        
        for(int i = 0; i < c; i++){
            dp[0][i] = 99999; //max_number;
            
        }
        
        for(int i =0 ; i < r; i++){
            dp[i][0] = 0;
        }
        
        for(int i = 1; i < r; i++){
            for(int j = 1; j < c; j++){
                if(j < coins[i-1]) dp[i][j] = dp[i-1][j];
                
                else{
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j - coins[i-1]] + 1);
                }
            }
        }
        int result = dp[r-1][c-1];
        if(result >= 99999) return -1;
        else return result;
        
    }
}