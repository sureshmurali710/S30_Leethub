class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        
        if(nums == null || nums.length == 0) return result;
        
        helper(nums, new ArrayList<>(), 0);
        
        return result;
        
        
    }
    
    private void helper(int[] nums, List<Integer> path, int i){
        //base
        
        if(i == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        
        //logic
        path.add(nums[i]);
        
        helper(nums, path, i+1);
        
        path.remove(path.size() - 1);
        //dont choose
        helper(nums, path, i+1);
        
        
        
    }
}