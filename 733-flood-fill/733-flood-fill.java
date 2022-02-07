class Solution {
    int [][] dirs;
    int color;
    int m;
    int n;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
     
        if(image[sr][sc] == newColor || image.length == 0 || image[0].length == 0 ||
          image == null) return image;
        m = image.length;
        n = image[0].length;
        color = image[sr][sc];
        dirs = new int [][]{{0,1},{1,0},{-1,0},{0,-1}};
        dfs(image, sr, sc, newColor);
        return image; 
        
    }
    
    private void dfs(int[][] image, int sr, int sc, int newColor){
        //base
        if(sr < 0 || sr >= m || sc >= n || sc < 0 || image[sr][sc] != color) return;
        //logic
        image[sr][sc] = newColor;
        for(int [] dir: dirs){
            int r = sr + dir[0];
            int c = sc + dir[1];
            dfs(image, r, c, newColor);
        }
    
        
        
    }
}