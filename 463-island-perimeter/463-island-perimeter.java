class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int result = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    result += 4;
                    
                    
                    if(i > 0 && grid[i-1][j] == 1){
                        result -= 2;
                    }
                
                    if(j > 0 && grid[i][j-1] == 1){
                        result -= 2;
                    }
                    
                    
                }
                
                
            }
        }
        
        return result;
    }
}