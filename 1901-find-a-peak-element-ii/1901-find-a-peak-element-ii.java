class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int nCols = mat[0].length;
    
        int leftCol = 0, rightCol = nCols - 1;
        while(leftCol <= rightCol){
          int midCol = leftCol + (rightCol - leftCol) / 2;
          int maxRow = 0;
          for(int row = 0; row < mat.length; row++){
            if(mat[maxRow][midCol] < mat[row][midCol]){
              maxRow = row;
            }
          }

          boolean leftGreater  = midCol > 0 && mat[maxRow][midCol - 1] > mat[maxRow][midCol];
          boolean rightGreater = midCol < nCols - 1 && mat[maxRow][midCol] < mat[maxRow][midCol+1];

          if(leftGreater){
            rightCol = midCol - 1;
          }else if(rightGreater){
            leftCol = midCol + 1;
          }else{
            return new int[]{maxRow, midCol};
          }

        }

        return  null;

    }
    }
