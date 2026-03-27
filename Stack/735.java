class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        for(int num : asteroids){
            while(!st.isEmpty() && st.peek() > 0 && num < 0){
                int sum = st.peek() + num;
                if(sum > 0){
                    num = 0;
                }
                else if(sum < 0){
                    st.pop();

                }
                else{
                    st.pop();
                    num = 0;
                }
            }
            if(num != 0){
                st.push(num);
            }
        }
        int s = st.size();
        int i = s - 1;
        int [] ans = new int [s];
        while(!st.isEmpty()){
            ans[i] = st.pop();
            i--;
        }
        return ans;
    }
}