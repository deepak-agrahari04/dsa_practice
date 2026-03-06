// LeetCode 75 - Sort Colors
// Difficulty: Medium
// Approach: Two Pointer
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int temp;
        int mid=0, low=0, high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}