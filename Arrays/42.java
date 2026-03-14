class Solution {
    public int firstMissingPositive(int[] nums) {
        /* nt n = nums.length;
        int[]arr = new int[n+1];
        
        for(int x = 1; x < n + 1; x++){
            boolean found = false;
        
           for(int i = 0; i < n; i++){
               if(nums[i] == x){
                 found = true;
                 break;
               }
            }
            if(!found){
            return x;
        }
        }
        
        return n+1;
        
        
        int n = nums.length;
        boolean[] present = new boolean[n + 1];

        // Mark present numbers
        for (int x : nums) {
            if (x >= 1 && x <= n) {
                present[x] = true;
            }
        }

        // Find first missing
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return n + 1;
        
        
         */

        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] <= 0 || nums[i] > n){
                nums[i] = n+1;
            }
        }

        for(int i = 0; i < n; i++){
            int val = Math.abs(nums[i]);
            if(val >= 1 && val <= n ){
                int index = val-1;
                if(nums[index] > 0){
                    nums[index] = -nums[index];
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(nums[i] > 0) {
                return i+1;
            }
        }
        return n+1;
    }
}