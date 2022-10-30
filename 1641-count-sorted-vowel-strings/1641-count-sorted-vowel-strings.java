class Solution {
    public int countVowelStrings(int n) {
        if(n == 0) return 0;
        
        int dp[][] = new int[n+1][5];
        
        Arrays.fill(dp[1], 1);
        
        for(int i = 2; i < n+1; i++){
            dp[i][4] += dp[i-1][0] + dp[i-1][1] + dp[i-1][2] +dp[i-1][3] + dp[i-1][4];
            dp[i][3] += dp[i-1][0] + dp[i-1][1] + dp[i-1][2] +dp[i-1][3];
            dp[i][2] += dp[i-1][0] + dp[i-1][1] + dp[i-1][2];
            dp[i][1] += dp[i-1][0] + dp[i-1][1];
            dp[i][0] += dp[i-1][0];
        }
        
        int sum = 0;
        int [] res = dp[n];
        
        for(int num:res){
            sum += num;
        }
        
        return sum;
        
        
    
        
    }
}