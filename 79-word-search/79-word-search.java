class Solution {
    int m; int n;
    public boolean exist(char[][] board, String word) {
        if(board.length == 0) return true;
        if(board == null) return false;
        m = board.length;
        n = board[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(backtrack(board, i, j, word, 0)) return true;
            }
        }
        
        return false;
    
    }
    
    
    private boolean backtrack(char[][] board,int i, int j, String word, int index){
        //base
        if(index == word.length()) return true;
        if(i < 0 || j < 0 || i == m || j == n) return false;
        //logic
        
        int [][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
        
        if(word.charAt(index) == board[i][j]){
            //action
            
            char temp = board[i][j];
            board[i][j] = '#';
            
            //recurse
            
            for(int [] dir: dirs){
                int r = dir[0] + i;
                int c = dir[1] + j;
                if(backtrack(board, r, c, word, index + 1)) return true;
            }
            //backtrack
            board[i][j] = temp;
            
        }
        
        return false;
        
    }
}