class Solution {
    public int hIndex(int[] citations) {
        if(citations.length == 0 || citations == null) return 0;
        
        int n = citations.length;
        
        int low = 0;
        int high = citations.length-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(citations[mid] == n-mid) return n-mid;
            else if(citations[mid] < n - mid) low = mid+1;
            else high = mid -1;
        }
        
        return n - low;
    }
}