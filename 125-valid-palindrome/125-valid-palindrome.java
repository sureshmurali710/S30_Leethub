class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
    
        
        while(l < r){
            Character c = s.charAt(l);
            Character d = s.charAt(r);
            
            if(!Character.isLetterOrDigit(c)){
                l++;
                continue;
            }
            
            if(!Character.isLetterOrDigit(d)){
                r--;
                continue;
            }
            
            if (Character.toLowerCase(c) != Character.toLowerCase(d)) {
                return false;
            }
            
            l++;
            r--;
        }
        return true;
        
    }
}