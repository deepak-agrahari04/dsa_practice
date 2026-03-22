class Solution {
    public int maxArea(int[] height) {
       int n = height.length;
       int ans = 0;
       int left = 0;
       int right = n-1;
       while(left < right){

            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * width;
            ans = Math.max(ans, area);


            if(height[left] < height[right]){
                left++;
            }    
            else{  
                right--;
            }        
        } 
        return ans; 
    }
}