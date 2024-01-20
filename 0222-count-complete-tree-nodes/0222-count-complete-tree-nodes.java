/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int answer = 0;
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        node(root);
        return answer;
    }
    public void node(TreeNode target) {
        if (target == null) return;
        answer++;
        
        node(target.left);
        node(target.right);
    }
}