class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        
        
        while(i < haystack.length() - needle.length() + 1){
            if(haystack.charAt(i) == needle.charAt(0)){
                int k = i;
                int j = 0;
                while(k < haystack.length()  && j < needle.length() &&
haystack.charAt(k) == needle.charAt(j)){
                    k++;
                    j++;
                    if(j == needle.length()){
                        return i;
                    }
                }
            }
        
        
        
        i++;
        }
    
        return -1;
        
    }
}