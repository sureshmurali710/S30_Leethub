class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        String prev = "";
        
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < words.length; i++){
            char [] c = words[i].toCharArray();
            Arrays.sort(c);
            
            String s = String.valueOf(c);
            
            if(!prev.equals(s)){
                result.add(words[i]);
                prev = s;
            }
        }
        
        return result;
        
        
    }
}