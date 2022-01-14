class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int m = queries.length;
        int[] prefix = new int[n];
        char[] arr = s.toCharArray();
        int curCnt = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == '*') curCnt++;
            else cnt = curCnt;
            prefix[i] = cnt;
        }
        int[] forward = new int[n];
        int p = n;
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] == '|') p = i;
            forward[i] = p;
        }
        // System.out.println(Arrays.toString(prefix));
        int[] ans = new int[m];
        for(int i = 0; i < m; i++){
            int[] query = queries[i];
            if(forward[query[0]] < n && forward[query[0]] <= query[1]){
                // System.out.println("right left: " + query[1] + " " + query[0]);
                ans[i] = prefix[query[1]] - prefix[forward[query[0]]];
            }
        }
        return ans;
    }
}