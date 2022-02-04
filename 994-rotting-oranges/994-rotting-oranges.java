class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid.length == 0 || grid == null || grid[0].length == 0) return -1;
        int r = 0;
        int c = 0;
        
        Queue<int []> q = new LinkedList<>();
        
        int fresh = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j< grid[0].length; j++){
                if(grid[i][j] == 2){
                    q.add(new int []{i, j});
                }else if(grid[i][j] == 1){
                    fresh++;
                }    
            }
        }
        
        if(fresh == 0) return 0;
        int time = 0;
        
        int[][] dirs = {{0,1}, {1,0}, {-1,0},{0,-1}};
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int [] curr = q.poll();
                for(int[] dir: dirs){
                     r = dir[0] + curr[0];
                     c = dir[1] + curr[1];
                    if(r < grid.length && r >= 0 && c < grid[0].length && c >= 0 && grid[r][c] == 1){
                        grid[r][c] = 2;
                        q.add(new int[] {r, c});
                        fresh--;
                
                    }
                
                    
                    }
            }
            
            time++;
        }
        
        if(fresh > 0 ) return -1;
        else return time-1;
        
        
        
        
        
        }
    }
