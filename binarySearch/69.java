class Solution {
    public int mySqrt(int x) {

        //brute force
       /* int ans = 0;
       for(int i = 1; i <= x; i++){
        if(i <= x/i){  //by using multiply it may overflow()i*i <= x)
            ans = i;
        }
        else{
            break;
        }
       }
       return ans; */

       //optimize
       int ans = 0;
       int start = 1;
       int end = x;
       
       if(x == 0 || x == 1) return x;
       while(start <= end){
        int mid = (start + end)/2;
        if(mid <= x/mid){
            ans = mid;
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
       }
       return ans;
    }
}