class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return result;
        
        int r = matrix.length-1;
        int c = matrix[0].length-1;
        
        int left = 0;
        int right = c;
        int top = 0;
        int bottom = r;
        
        
        while(left <= right && top <= bottom){
            //move right
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            
            top++;
            
            //move down
            for(int i = top; i<= bottom;i++){
                result.add(matrix[i][right]);
            }
            
            right--;
            
            //move left
            if(left <= right && top <= bottom){
                for(int i = right; i>= left; i--){
                result.add(matrix[bottom][i]);
                }
            }
            
            bottom--;
            
            //move up
            if(left <= right && top <= bottom){
                for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
             }
            }
            left++;
            
        }
        
        return result;
    
        
        
    }
}