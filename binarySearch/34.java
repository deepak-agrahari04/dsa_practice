class Solution {
    int findfirst(int[] nums, int target){
        int ans = -1;
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    int findsecond(int[] nums, int target){
        int n = nums.length;
        int ans = -1;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
      
      return new int[]{findfirst(nums, target), findsecond(nums, target)};
    }
}