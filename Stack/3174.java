class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int len = sb.length();
            if(len > 0 && Character.isDigit(ch)){
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}