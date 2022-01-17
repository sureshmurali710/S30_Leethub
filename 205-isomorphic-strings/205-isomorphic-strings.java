class Solution {
    public boolean isIsomorphic(String s, String t) {
          if(s.length() != t.length()) return false;
        
        // HashMap<Character, Character> sCharmap = new HashMap<>();
        // HashMap<Character, Character> tCharmap= new HashMap<>();
        
        char [] sMap = new char[100];
        char [] tMap = new char[100];
        
        for(int i = 0; i < s.length(); i++){
            
            // char sChar  = s.charAt(i);
            // char tChar  = t.charAt(i);
            
            
            if(sMap[s.charAt(i) - ' '] == 0){
                sMap[s.charAt(i) - ' '] = t.charAt(i);
                
            }else if(sMap[s.charAt(i) - ' '] != t.charAt(i)) return false;
            
            if(tMap[t.charAt(i) - ' '] == 0){
                tMap[t.charAt(i) - ' '] = s.charAt(i);
                
            }else if(tMap[t.charAt(i) - ' '] != s.charAt(i)) return false;
            
        }
        
        return true;
        
        
    }
}