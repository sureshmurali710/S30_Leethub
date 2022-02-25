class Solution {
    
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        public TrieNode(){
            this.children = new TrieNode[26];
        }
    }
    
    TrieNode root;
    private void insert(String word){
        TrieNode curr = root;
        
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            
            if(curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new TrieNode();
            }
            
            curr = curr.children[c - 'a'];
        }
        
        curr.isEnd = true;
    }
    
    
    
    
    public String replaceWords(List<String> dictionary, String sentence) {
        root = new TrieNode();
        
        for(String word: dictionary){
            insert(word);
        }
        
        String [] splitArr = sentence.split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        StringBuilder replacement;
        TrieNode curr;
        
        for(int k = 0; k < splitArr.length; k++){
            curr = root;
            replacement = new StringBuilder();
            
            String word = splitArr[k];
            
            if(k > 0){
                result.append(" ");
            }
            
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(curr.children[c - 'a'] == null || curr.isEnd) break;
                curr = curr.children[c - 'a'];
                replacement.append(c);
            }
        
            if(curr.isEnd){
                result.append(replacement.toString());
            }else{
                result.append(word);
            }
            
        }
        
        
        return result.toString();
        
        
        
    }
}