class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int [m*n];
        int r = 0;
        int c = 0;
        if(mat == null || mat.length == 0 || mat[0].length == 0) return result;
        int direction = 1; // upwards
        int i = 0;
        
        while(i < m*n){
            result[i] = mat[r][c];
            if(direction == 1){
                
                if(c == n-1){
                    r++; direction = -1;
                }
                else if(r == 0){
                    c++; direction = -1;
                }else{
                    r--; c++;
                }
            }else{
                if(r == m-1){
                    c++; direction = 1;
                }
                else if(c == 0){
                    r++; direction  = 1;
                    
                }else{
                    r++; c--;
                }
            }
            
            i++;
           
        }
        
        return result;
        
    }
}