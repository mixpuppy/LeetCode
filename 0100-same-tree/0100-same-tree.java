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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 기본적으로 두 노드가 널이라면 true
        if(p == null && q == null) return true;
        // 하나의 트리만 널이거나 현재 노드의 값이 다른경우 false;
        if(p == null || q == null || p.val != q.val) return false;
        // left 와 right 역시 재귀적으로 호출하여 같은 트리인지 확인 --> 전체 이진 트리를 확인 가능
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}