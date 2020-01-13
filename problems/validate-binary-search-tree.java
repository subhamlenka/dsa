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
    public boolean isValidBST(TreeNode root) {

        return checkNode(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }

    boolean checkNode(TreeNode node,long min,long max){
        if(node == null) return true;

        if(node.val>min && node.val<max){

            return (checkNode(node.left,min,node.val) && checkNode(node.right,node.val,max));
        }
        else{
            return false;
        }
    }

}