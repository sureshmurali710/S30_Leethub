class Solution {
    public int hIndex(int[] citations) {
        if(citations.length == 0 || citations == null) return 0;
        int low = 0;
        int high = citations.length-1;
        
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(citations[mid] == citations.length - mid){
                return citations.length-mid;
            }
            else if(citations[mid] < citations.length - mid){
                low = mid + 1;
                 
            }else{
                high = mid - 1;
            }   
        }
        return citations.length - low;
    }
}