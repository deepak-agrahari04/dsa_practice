class Solution {

    boolean canEatAll(int[] piles, int mid, int h){
        int actualHour = 0;
        for(int x : piles){
            actualHour += x/mid;
            if(x%mid != 0){
                actualHour++;
            }
        }
         return actualHour <= h;
    }
   
    public int minEatingSpeed(int[] piles, int h) {
      int n = piles.length;
      int max = piles[0];

      for(int i = 1; i < n; i++){
          if(piles[i] > max){
              max = piles[i];
          }
      }
      int start = 1;
      int end = max;
      while(start < end) {
        int mid = start + (end - start)/2;
        if(canEatAll(piles, mid, h)){
            end = mid;
        }
        else{
            start = mid + 1;
        }
      } 
      return start;
    }
}