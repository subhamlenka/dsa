/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {

        if(root==null) return true;
        return checkNode(root.left,root.right);

    }

    boolean checkNode(TreeNode root1,TreeNode root2){

        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;

        if( root1.val==root2.val && checkNode(root1.left,root2.right) && checkNode(root1.right,root2.left)){
            return true;
        }
        return false;
    }

}