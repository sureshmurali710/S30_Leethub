class Solution {
  public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        return Math.max(robb(nums,0,nums.length-1),robb(nums,1,nums.length));
    }
    public int robb(int[] nums,int start,int end)
    {
        int prev_house=0,prev_prev_house=0,max=0;
        for(int i=start;i<end;i++)
        {
            max=Math.max(prev_house,prev_prev_house+nums[i]);
            prev_prev_house=prev_house;
            prev_house=max;
        }
        return max;
    }
}