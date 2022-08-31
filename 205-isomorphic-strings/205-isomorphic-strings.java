class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        
        
        
        for(int i = 0; i < s.length(); i++){
            if(smap.get(s.charAt(i)) != null){
                if(smap.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            else smap.put(s.charAt(i), t.charAt(i));
        }
        
        for(int i = 0; i < t.length(); i++){
            if(tmap.get(t.charAt(i)) != null){
                if(tmap.get(t.charAt(i)) != s.charAt(i)) return false;
            }
            else tmap.put(t.charAt(i), s.charAt(i));
        }
        return true;
        
        
        
    }
}