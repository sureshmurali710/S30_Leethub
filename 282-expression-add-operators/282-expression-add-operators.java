class Solution {
    List<String> result;
    public List<String> addOperators(String num, int target) {
        result = new ArrayList<>();
        
        helper(num, target, new StringBuilder(),0, 0, 0);
        
        return result;
        
    }
    
    private void helper(String num, int target, StringBuilder sb, long calc, long tail, int idx){
        //base
        if(idx == num.length()){
            if(target == calc){
                result.add(sb.toString());
                return;
            }
        }
        
        //logic
        
        for(int i = idx; i < num.length(); i++){
            if(idx != i && num.charAt(idx) == '0') break;
             long curr = Long.parseLong(num.substring(idx, i+1));
            int len = sb.toString().length();
            if(idx == 0){
                
                //action
                sb.append(curr);
                //recurse
                helper(num, target, sb, curr, curr, i+1);
                //backtrack
                sb.setLength(len);
                
            }else{
                sb.append('+');
                sb.append(curr);
                helper(num, target, sb, calc + curr, curr, i+1);
                sb.setLength(len);
                
                sb.append('-');
                sb.append(curr);
                helper(num, target, sb, calc - curr, -curr, i+1);
                sb.setLength(len);
                
                
                sb.append('*');
                sb.append(curr);
                helper(num, target, sb, calc - tail + tail * curr, tail * curr, i+1);
                sb.setLength(len);
            }
        }
    }
}
