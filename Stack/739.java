class Solution {
    public int[] dailyTemperatures(int[] nums) {
        /* int n = nums.length;
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[j] > nums[i]){
                    int gap = j - i;
                    arr[i] = gap;
                    break;
                }
                else{
                   continue;
            }
            }
        }
        return arr; */

        int n = nums.length;
        Stack <Integer> st = new Stack <>();
        int [] arr = new int [n];
        for(int i = n - 1; i >= 0; i--){
            while(!st.empty() && nums[i] >= nums[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                arr[i] = 0;
            }
            else{
                arr[i] = st.peek() - i;
            }
            st.push(i);
        }
        return arr;
    }
}