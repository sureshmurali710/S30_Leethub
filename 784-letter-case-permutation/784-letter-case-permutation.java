class Solution {
    List<String> result;
    public List<String> letterCasePermutation(String s) {
        
        result = new ArrayList<>();
        s = s.toLowerCase();
        result.add(s);
        backtrack(s.toCharArray(), 0);
        
        return result;
        
    }
    
    private void backtrack(char [] c, int idx){
        
        //logic
        
        
        for(int i = idx; i < c.length; i++){
            if(Character.isLetter(c[i])){
                c[i] = Character.toUpperCase(c[i]);
                result.add(new String(c));
                backtrack(c, i+1);
                c[i] = Character.toLowerCase(c[i]);
            }
            
        }
        
        
        
    }
}