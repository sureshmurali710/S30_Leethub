class Solution {
    public int repeatedStringMatch(String a, String b) {
        int alen = a.length();
        int blen = b.length();
		int mul = blen/alen;           //at least this much we need to a to itself
        String tempa = a;
        for(int i=1;i<(3+mul);i++){
            if(a.contains(b)){
                return i;
            }
            a += tempa;
        }
        return -1;
    }
    }
