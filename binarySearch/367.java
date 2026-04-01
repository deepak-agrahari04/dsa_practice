class Solution {
    public boolean isPerfectSquare(int nums) {
        
        int start = 1;
        int end = nums;
        if(nums == 0 || nums == 1) return true;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid == nums/mid && nums % mid == 0){
                return true;
                
            }
            else if(mid < nums/mid){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}