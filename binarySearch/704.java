class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int end = n - 1; 
        int start = 0;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
    return -1;
    }
}