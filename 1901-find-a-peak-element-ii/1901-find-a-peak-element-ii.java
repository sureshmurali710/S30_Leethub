class Solution {
    public int[] findPeakGrid(int[][] mat) {
       int n = mat.length, m = mat[0].length;
        
        int lo = 0, hi = m-1;
        
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int[] temp = f1(mat, mid, n, m);
            
            if(temp[1] == mid) return temp;
            else if(temp[1] == mid+1) lo = mid+1;
            else hi = mid - 1;
        }
        
        return null;
        
    }
    
    // Find max of the three columns
    public int[] f1(int[][] mat, int mid, int n, int m){
        
        int max = Integer.MIN_VALUE;
        int[] ans = new int[2];
        
        for(int i=0;i<n;i++){
            
            // Left column
            if(mid-1>=0 && mat[i][mid-1]>max){
                max = mat[i][mid-1];
                ans[0] = i;
                ans[1] = mid-1;
            }
            
            // Central column
            if(mat[i][mid]>max){
                max = mat[i][mid];
                ans[0] = i;
                ans[1] = mid;
            }
            
            // Right column
            if(mid+1<m && mat[i][mid+1]>max){
                max = mat[i][mid+1];
                ans[0] = i;
                ans[1] = mid+1;
            }

        }
        
        return ans;
        
    
    }
    }
