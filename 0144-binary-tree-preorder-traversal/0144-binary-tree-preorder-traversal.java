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
 //전위순회 문제
 //왼쪽 서브트리부터 모두 방문
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode current = root;

        if(root == null) return list;
        addList(current, list);
        return list;
    }
    public void addList(TreeNode current, List<Integer> list) {
        if (current == null) return;
        list.add(current.val);
        addList(current.left, list);
        addList(current.right, list);
    }
}