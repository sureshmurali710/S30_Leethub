class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new ArrayList<>();
        Arrays.sort(candidates);
        if(candidates == null || candidates.length == 0) return result;
        
        backtrack(candidates, target, new ArrayList<Integer>(), 0);
        return result;
        
    }
    
    private void backtrack(int [] candidates, int target, List<Integer> path, int idx){
        //base
        if( target == 0){
            result.add(new ArrayList<>(path));
            return;
        }
        
        if(target < 0) return;
        
        
        //logic
        for(int i = idx; i< candidates.length; i++){
            
            if(i == idx || candidates[i] != candidates[i-1]){
                path.add(candidates[i]);
                //recurse
                backtrack(candidates, target - candidates[i], path, i+1);
                //backtrack
                path.remove(path.size() - 1);
                
            }
            
            
        }
    }
}