class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        int n = strs.length;
        
        for(int i =0 ; i < n;i++){
            char [] c = strs[i].toCharArray();
            
            Arrays.sort(c);
            
            String SortedStr = String.valueOf(c);
            
            if(!map.containsKey(SortedStr)){
                map.put(SortedStr, new ArrayList<String>());
            }
            map.get(SortedStr).add(strs[i]);
            
        }
        return new ArrayList<List<String>>(map.values());
    }
}