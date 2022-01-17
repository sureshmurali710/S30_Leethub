class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0 || nums == null) return 0;
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        int currSum = 0;
        
        int count = 0;
        
        map.put(0, 1);
        
        for(int i =0; i< nums.length; i++){
            currSum += nums[i];
            
            if(map.containsKey(currSum-k)){
                
                count += map.get(currSum-k);
                
                
            }
            
            
            if(!map.containsKey(currSum)){
                map.put(currSum, 1);
            }else{
                int newcnt = map.get(currSum);
                newcnt++;
                map.put(currSum, newcnt);
            }
           
            
            
        }
        
        
        
        
        return count;
        
        
            
    }
}