class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int low = 0;
        int high = arr.length - k;
        
        while(low < high){
            int mid = (low + high)/2;
            
            int distL = x - arr[mid];
            int distR = arr[mid+k] - x;
            
            if(distL > distR) low = mid+1;
            else high = mid;
        }
        
        for(int i = low; i< low + k; i++){
            result.add(arr[i]);
        }
        
        return result;
    }
}