class Solution {
    public String decodeString(String s) {
        if(s == null || s.length() == 0) return "";
        
        Stack<Integer> num_st = new Stack<>();
        
        Stack<String> s_st = new Stack<>();
        
        int num =0; 
        String str = "";
        
        for(int i = 0;  i < s.length() ; i++){
            char c = s.charAt(i);
            
            if(Character.isDigit(c)){
                num = num * 10 + c - '0';
                
            }else if(c == '['){
                num_st.add(num);
                s_st.add(str);
                num = 0 ; str = "";
            }else if( c == ']'){
                int times = num_st.pop();
                String newstr = "";
                for(int j = 0; j< times;j++)
                {
                    newstr = newstr + str;
                }
                
                str = s_st.pop() + newstr;
            }else{
                str = str + c;
            }
            
            }
        
        
        return str;
        }
        
        
    }
