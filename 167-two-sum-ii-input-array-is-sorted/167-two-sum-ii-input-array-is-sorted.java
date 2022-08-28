class Solution {
public int[] twoSum(int[] numbers, int target) {
    int[] res = new int[2];
    if(numbers == null || numbers.length < 1) return res;
        int lo = 0, hi = numbers.length-1;
        while(lo+1 < hi){
            if(numbers[lo] + numbers[hi] == target){
            res[0] = lo+1;
            res[1] = hi+1;
            //return res;
            break;
            }else if(numbers[lo] + numbers[hi] > target){
            hi--;
            }else{
            lo++;
            }
            }
            if(numbers[lo] + numbers[hi] == target){
            res[0] = lo+1;
            res[1] = hi+1;
            return res;
            }
            return res;
        }
    }