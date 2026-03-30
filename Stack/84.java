class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max_ar = 0;
        int [] left = new int [n];
        int[] right = new int [n];
        Stack<Integer> st= new Stack<>();
        //right smaller
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
         }

        while(!st.isEmpty()){
            st.pop();
        }

         //left smaller
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
         }

         int ans =0;
         for(int i = 0; i < n; i++){
            int width = right[i] - left[i] - 1; 
            int currarea = heights[i] * width;
            ans = Math.max(currarea, ans);
         }
    return ans;
    }
}