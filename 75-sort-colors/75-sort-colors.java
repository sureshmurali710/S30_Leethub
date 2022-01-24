class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int low = 0;
        int mid = 0;
        
        int high = nums.length-1;
        
        
        while(mid <= high){
            //case 1
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            
            //case 2
            else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            
            //case 3
            else{
                mid++;
            }
        }
        
    }
    
    private void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}