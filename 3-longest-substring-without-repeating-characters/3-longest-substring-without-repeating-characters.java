class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int max = 0;
        
        int start = 0;
        int end = 0;
        
        while(start >= 0 && end <= s.length()-1){
            char c = s.charAt(end);
            while(set.contains(c)){
                set.remove(s.charAt(start++));
            }
            
            set.add(c);
            max = Math.max(max, set.size());
            end++;
            
            
        }
        
        return max;
    }
}