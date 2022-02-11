class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        if(candidates == null || candidates.length == 0) return result;
        backtrack(candidates, new ArrayList<>(), target, 0);
        
        return result;
    }
    
    private void backtrack(int [] candidates, List<Integer> path, int target, int idx){
        //base
        if(target == 0){
            result.add(new ArrayList<>(path));
            return;
        } 
        
        if(target < 0){
            return;
        }
        
        //logic
        
        for(int i = idx; i< candidates.length; i++){
            //action
            path.add(candidates[i]);
            
            //recurse
            backtrack(candidates, path, target - candidates[i], i);
            
            //backtrack
            path.remove(path.size() - 1);
            
        }
        
        
        
        
    }
}