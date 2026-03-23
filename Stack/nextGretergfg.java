class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int [] ans = new int [n];
        
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1:st.peek();
            st.push(arr[i]);
            
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : ans) {
            res.add(num);
        }
        return res;
    }
}