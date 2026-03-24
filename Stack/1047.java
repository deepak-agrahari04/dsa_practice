class Solution {
    public String removeDuplicates(String s) {
        /* int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                if(ch == st.peek()){
                    st.pop();
                    continue;
                }
                else{
                    st.push(ch);
                }
            }
        }
         StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
           
            sb.append(st.pop()); 
        }
        String result = sb.reverse().toString();
        return result; */


        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int len = sb.length();
            if(len > 0 && ch == sb.charAt(len - 1)){
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}