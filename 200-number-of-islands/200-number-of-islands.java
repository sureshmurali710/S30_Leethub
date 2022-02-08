class Solution {
    int m;
    int n;
    
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        m = grid.length;
        n = grid[0].length;
        
        int count = 0;
        
        for(int i = 0; i<m ; i++){
            for(int j =0; j <n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    
    private void dfs(char [][] grid, int i, int j){
        //base
        if(i < 0  || i >= m || j < 0 ||j >= n || grid[i][j] == '0') return;
           
        //logic
        
        int [][] dirs = new int[][] {{0,1},{1,0},{-1,0},{0,-1}};
        grid[i][j] = '0';
        for(int [] dir : dirs){
            int r = dir[0] + i;
            int c = dir[1] + j;
            dfs(grid, r, c);
        }
    }
}