class Solution {
    public boolean judgeCircle(String moves) {
        int t=0;
        int d=0;
        for(char a:moves.toCharArray()){
            if(a=='U'){
                t+=1;
            }
            else if(a=='D'){
                t-=1;
            }
            else if(a=='L'){
                d+=1;
            }
            else if(a=='R'){
                d-=1;
            }
        }
        return t==0 && d==0;
    }
}