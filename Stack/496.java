class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int [] result = new int [n];

        for(int i = 0; i < n; i++){
            int target = nums1[i];
            int index = -1;

            for(int j = 0; j < nums2.length; j++){
                if(nums2[j] == target){
                    index = j;
                    break;
                }
            }
            int nextele = -1;
            for(int j = index + 1; j < nums2.length; j++){
                if(nums2[j] > target){
                    nextele = nums2[j];
                    break;
                }
            }
            result[i] = nextele;
        }
        return result;
    }
}