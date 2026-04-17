class Solution {
    boolean inorder(TreeNode root, int targetSum, int sum){
        if(root == null) return false;
        sum = sum + root.val;
        if(root.left == null && root.right == null){
            return sum == targetSum;
        }
        boolean leftside = inorder(root.left, targetSum, sum);
        boolean rightside = inorder(root.right, targetSum, sum);

        return leftside || rightside;
        }

    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return inorder(root, targetSum, sum);
    }
}