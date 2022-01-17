class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
     //if (k == 0) return false;  // [[0,0], 0]
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // next 0 must be or after i == 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            if (k != 0) sum = sum % k;
            if (map.containsKey(sum)) {
                if (i - map.get(sum) >= 2) return true;
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }
}