class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        Set<Integer> remove_idx = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
              st.push(i);
            }
            else if(s.charAt(i) == ')'){
                if(st.isEmpty()){
                    remove_idx.add(i);
                }
                else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            remove_idx.add(st.pop());
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            if(remove_idx.contains(i)){
                continue;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}