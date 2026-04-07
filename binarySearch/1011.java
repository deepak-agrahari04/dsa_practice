class Solution {
   
     int finddays(int [] nums, int cap){
        int days = 1;
        int load = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] + load > cap){
                days++;
                load = nums[i];
            }
            else{
                load = load + nums[i];
            }
        }
        return days;
     }
 
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : weights){
            if(num > max){
                max = num;
            }
            sum = sum + num;
        }
        int start = max;
        int end =  sum;
        while(start < end){
            int mid = start + (end - start)/2;
            int noOfDays = finddays(weights, mid);
            if(noOfDays <= days){
                end = mid;
            }
            else{
                start = mid + 1;
            }

  
        }
          return  start;
    }
}