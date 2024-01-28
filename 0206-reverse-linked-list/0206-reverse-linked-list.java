/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    Stack<ListNode> s = new Stack<>();
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        helper(head);
        ListNode list = s.pop();
        ListNode idx = list;
        
        while (!s.isEmpty()) {
            idx.next = s.pop();
            idx = idx.next;
        }
        idx.next = null; // 뒤집힌 연결 리스트의 끝을 null로 설정

        return list;
    }
    public void helper(ListNode node) {
        if(node == null) return;
        s.add(node);
        helper(node.next);
    }
}