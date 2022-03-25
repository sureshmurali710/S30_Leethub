class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int start =0;
        int fast = 0;
        int rsum =0 ;
        int max_sum = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        
        while(fast < nums.length){
            if(!set.contains(nums[fast])){
                set.add(nums[fast]);
                rsum = rsum + nums[fast];
                max_sum = Math.max(rsum, max_sum);
                fast++;
                
            }else{
                set.remove(nums[start]);
                rsum = rsum - nums[start];
                start++;
            }
        }
        
        return max_sum;
    }
}