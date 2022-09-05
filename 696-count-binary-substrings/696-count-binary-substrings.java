class Solution {
    public int countBinarySubstrings(String s) {
        
        
        if(s.length() < 2) return 0;
        
        int prev = 0;
        int curr = 1;
        int ans = 0;
        
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                ans += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }else{
                curr++;
            }
        }
        
        return ans + Math.min(prev, curr);
        
        
    }
}