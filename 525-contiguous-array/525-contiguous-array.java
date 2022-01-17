class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int zero = 0;
        int max = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zero++;
            else zero--;
            
            if(!map.containsKey(zero)) map.put(zero, i);
            
            if(zero == 0) max = i+1;
            
            max = Math.max(max, i - map.get(zero));
            
            
        }
        return max;
        
    }
}