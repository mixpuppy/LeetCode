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
 // 이진트리 후위순회 PostOrder
 // left -> right -> root
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        addList(root, list);
        return list;
    }
    public void addList(TreeNode node, List<Integer> list) {
        if(node == null) return;
        
        addList(node.left, list);
        addList(node.right, list);
        list.add(node.val);
    }
}