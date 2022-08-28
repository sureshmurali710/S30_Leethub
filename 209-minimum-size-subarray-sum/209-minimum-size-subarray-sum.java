class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0; 
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            
            while(sum >= target){
                result = Math.min(result, i+1-left);
                
                sum -= nums[left];
                left++;
            }
        }
        
        return result != Integer.MAX_VALUE? result:0;
    }
}