class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        
        return Math.max(rob(nums, 0, nums.length-1), rob(nums, 1, nums.length));
            

    }
    
    private int rob(int[] nums, int start, int end){
        int prev_max =0;
        int prev = 0;
        int max = 0;
        
        for(int i = start;i < end; i++){
            max = Math.max(prev_max + nums[i], prev);
            prev_max = prev;
            prev = max;
            
        }
        return max;
    }
}