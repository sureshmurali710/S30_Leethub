class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int x=0, y=0, m = mat.length, n = mat[0].length ;
        int [][]a = {
            {-1,0},{1,0},{0,1},{0,-1}
        }; 
        while(true){
            boolean flag = true;
            for(int i=0;i<4;i++){
                int x1 = x + a[i][0];
                int y1 = y + a[i][1];
                if(x1 >= 0 && y1 >= 0 && x1 < m && y1 < n && mat[x][y] < mat[x1][y1]){
                    flag = false;
                    x = x1;
                    y = y1;
                }
            }
            if(flag){
                return new int[]{x,y};
            }
        }
    
    }
    }
