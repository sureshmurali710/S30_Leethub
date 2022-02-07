class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
     
        if(image[sr][sc] == newColor || image.length == 0 || image[0].length == 0 ||
          image == null) return image;

        Queue<int []> q = new LinkedList<>();
        int color = image[sr][sc];
        image[sr][sc] = newColor;
        
        int [][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
        q.add( new int[]{sr, sc});
        
        while(!q.isEmpty()){
            int size = q.size();
            int[] curr = q.poll();
            for(int [] dir: dirs){
                int r = dir[0] + curr[0];
                int c = dir[1] + curr[1];
                
                if(r >= 0 && r < image.length &&  c < image[0].length && c >= 0 && image[r][c] == color){
                
                    image[r][c] = newColor;
                    q.add(new int []{r, c});
                }
            }
            
            
        }
        
        return image;
        
        
        
    }
}