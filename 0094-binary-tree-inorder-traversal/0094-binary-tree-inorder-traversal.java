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
    // 중위 순회 문제 (Inorder Traversal)
    // 노드를 순회할 때, 왼쪽 자식 노드를 먼저 방문한 후 현재 노드를 방문하고 오른쪽 자식 노드를 순서대로 방문
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        
        return recorder(root, list);
    }
    public List<Integer> recorder(TreeNode t1, List<Integer> list) {
        //base case
        if (t1 == null) return list; 
        if (t1.left != null) { 
            recorder(t1.left, list); 
        }
        list.add(t1.val); 
        if (t1.right != null) {
            recorder(t1.right, list);
        }
        return list;
    }
}