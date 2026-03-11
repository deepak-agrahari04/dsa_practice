// LeetCode 53 - Maximum Subarray
// Difficulty: Medium
// Approach: Kadane's Algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        // int max=Integer.MIN_VALUE;
        
        // int n = nums.length;
        // for(int i = 0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){   
        //             sum=sum+nums[j];
        //             if(sum>max){
                       
        //                max=sum;
        //             }
                
        //     }
            
        // }
        // return max;
        int max=Integer.MIN_VALUE;
        int n = nums.length;
        int curr_sum =0;
        for(int i = 0;i < n;i++){
           curr_sum = curr_sum+nums[i];
           if(curr_sum > max){
            max = curr_sum;
           }
           if(curr_sum<0){
            curr_sum = 0;
           }
        }
        return max;
    }
}