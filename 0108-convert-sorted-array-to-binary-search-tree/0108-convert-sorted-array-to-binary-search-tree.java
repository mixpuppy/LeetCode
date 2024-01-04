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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode tree = new TreeNode();
        makeTree(nums, tree);
        return tree;
    }
    public void makeTree(int[] nums, TreeNode tree) {
        int start = 0;
        int end = nums.length-1;
        int midIdx = start + (end - start) / 2;

        tree.val = nums[midIdx];

        // 중간을 기준으로 왼쪽과 오른쪽 배열 생성
        int[] leftArray = Arrays.copyOfRange(nums, start, midIdx);
        int[] rightArray = Arrays.copyOfRange(nums, midIdx + 1, end + 1);
        // 왼쪽 하위 트리 생성
        if (leftArray.length > 0) {
            tree.left = new TreeNode();
            makeTree(leftArray, tree.left);
        }
        // 오른쪽 하위 트리 생성
        if (rightArray.length > 0) {
            tree.right = new TreeNode();
            makeTree(rightArray, tree.right);
        }
    }
}