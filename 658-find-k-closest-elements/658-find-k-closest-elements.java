class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        if(arr == null || arr.length == 0) return result;
        int low = 0;
        int high = arr.length-k;
        
        while(low < high){
            
            int mid = low + (high - low)/ 2;
            int distF = x - arr[mid];
            int distL = arr[mid + k] - x;
            
            if(distF > distL){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        
        for(int i = low; i< low+k; i++){
            result.add(arr[i]);
        }
        
        return result;
    }
}
        