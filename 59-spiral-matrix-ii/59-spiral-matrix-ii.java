class Solution {
    public int[][] generateMatrix(int n) {
        int[][]  result = new int [n][n];
        
        if(n == 0) return result;
        
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        
        int counter = 1;
        
        while(left<=right && top <= bottom){
            //move right-> first row
            
            for(int i = left; i<=right; i++){
                result[top][i] = counter++;
            }
            //shrink right
            top++;
            
            //move down -> last col
            for(int i = top; i<= bottom; i++){
                result[i][right] = counter++;
            }
            right--;
            
            //move left -> last row
            if(left<=right && top <= bottom)
               {
                   for(int i = right; i>= left; i--){
                        result[bottom][i] = counter++;
                    }
               }
               
            bottom--;
            
            //move up -> first col
            if(left<=right && top <= bottom){
                for(int i = bottom; i >= top; i--){
                    result[i][left] = counter++;
                }
            }
            left++;
            
            
        }
        return result;
    }
}