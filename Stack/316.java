class Solution {
    public String removeDuplicateLetters(String s) {
      int n = s.length();
      StringBuilder result = new StringBuilder();
      boolean [] ans = new boolean[26];                      
      int [] lastIndex = new int[26];
      for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            lastIndex[c - 'a'] = i;
    }

         for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            int idx = c - 'a';
            if(ans[idx] == true){
                continue;
            } 
            while(result.length() > 0 && result.charAt(result.length() - 1) > c && lastIndex[result.charAt(result.length() - 1) - 'a'] > i){
                ans[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }
            result.append(c);
            ans[idx] = true;
         } 
         return result.toString(); 


         
        /*  int n = s.length();
         int lastIndex [] =  new int[26];
         boolean used [] = new boolean[26];
         for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            lastIndex[c - 'a'] = i;
            }

            Stack<Character> st = new Stack<>();
             
            for(int i = 0; i < n; i++){
                char ch = s.charAt(i);
                int idx = ch - 'a';

                if(used[idx]) continue;

                 while(!st.isEmpty() && st.peek() > ch && lastIndex[st.peek() - 'a'] > i){
                    used[st.pop() - 'a'] = false;
                 }
                 st.push(ch);
                 used[idx] = true;
            }
         
         StringBuilder result = new StringBuilder();
         for(char ch : st){
            result.append(ch);
         }
         return result.toString();
           */
    }
}