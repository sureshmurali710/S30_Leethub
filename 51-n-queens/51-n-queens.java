class Solution {
    List<List<String>> result;
    int [][] board;
    public List<List<String>> solveNQueens(int n) {
         result = new ArrayList<>();
         board = new int [n][n];
         backtrack(0, n);
         return result;
    }
    
    private void backtrack(int r, int n){
        //base
        if( r == n){
            List<String> li = new ArrayList<>();
        
            for(int i = 0; i < n; i++){
                StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    sb.append("Q");
                }else{
                    sb.append(".");
                }
                }
                li.add(sb.toString());
            }
             result.add(li);
        }
        
        //logic
        
        for(int c = 0; c < n; c++){
            if(isSafe(r, c, n)){
                //action
                board[r][c] = 1;
                
                //recurse
                backtrack(r+1, n);
                
                //backtrack
                board[r][c] = 0;
            }
        }
        
        
    }
    
    private boolean isSafe(int r, int c, int n){
        for(int i = 0; i < r; i++){
            if(board[i][c] == 1) return false;
        }
        
        //diagonal up right
        
        int j = r; int k = c;
        while(j >= 0 && k < n){
            if(board[j][k] == 1) return false;
            j--; k++;
        }
        
          //diagonal up left
        
        j = r; k = c;
        while(j >= 0 && k >= 0){
            if(board[j][k] == 1) return false;
            j--; k--;
        }
        
        return true;
        
        
        
    }
}