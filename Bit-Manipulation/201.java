// LeetCode 201 - Bitwise AND of Numbers Range
// Difficulty: Medium
// Approach: Bit Manipulation
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while(left < right){
            right = right & (right - 1); //removes the rightmost set bit of right
        }
        return right;
    }
}