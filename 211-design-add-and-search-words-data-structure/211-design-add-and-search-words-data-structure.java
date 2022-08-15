class WordDictionary {
    
    class TrieNode{
        boolean isEnd;
        
        Map<Character, TrieNode> children;
        
        public TrieNode(){
              children = new HashMap<>();
              isEnd = false;
        }
    }
    
        
    
    
    TrieNode root;
    
    

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode curr = root;
        
        for(int i = 0; i < word.length(); ++i){
            char c = word.charAt(i);
            if(!curr.children.containsKey(c)){
                curr.children.put(c, new TrieNode());
            }
            curr = curr.children.get(c);
        }
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        TrieNode curr= root;
        boolean result = searchRecursive(curr, word, 0);
        return result;
    }
    
    private boolean searchRecursive(TrieNode curr, String word, int index){
        if(index == word.length()){
            return curr.isEnd;
        }
        
        char c = word.charAt(index);
        
        if(c == '.'){
            boolean result;
            for(Character ch: curr.children.keySet()){
                TrieNode node = curr.children.get(ch);
                result = searchRecursive(node, word, index+1);
                
                if(result)
                    return true;
            }
            
            return false;
        }else{
            if(curr.children.containsKey(c)){
                return searchRecursive(curr.children.get(c), word, index+1);
            }else{
                return false;
            }
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */