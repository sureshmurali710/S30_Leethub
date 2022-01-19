class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(m == 1 && n == 1 && obstacleGrid[0][0] == 0) return 1;
        if(m == 1 && n == 1 && obstacleGrid[0][0] == 1) return 0;
        int[][] dp = new int[m][n];
        if(obstacleGrid[m-1][n-1] == 1) return 0;
       
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = -1;
                }
            }
        }
        
        //row
        for(int i = m-2; i >= 0; i--){
            if(dp[i][n-1] == -1){
                break;
            }
            dp[i][n-1] = 1;
        }
        
        //col
        for(int i = n-2; i >= 0; i--){
            if(dp[m-1][i] == -1){
                break;
            }
            dp[m-1][i] = 1;
        }
        
        for(int i = m-2; i >= 0; i--){
            for(int j = n-2; j >= 0; j--){
                if(dp[i][j] == -1) continue;
                if(dp[i+1][j] == -1 && dp[i][j+1] == -1) continue;
                if(dp[i+1][j] == -1){
                    dp[i][j] = dp[i][j+1];
                }
                else if(dp[i][j+1] == -1){
                    dp[i][j] = dp[i+1][j];
                }else{
                    dp[i][j] = dp[i+1][j] + dp[i][j+1];
                }
            }
        }
        if(dp[0][0] == -1) return 0;
        return dp[0][0];
    }
}