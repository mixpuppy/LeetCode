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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return ;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode origin = head;
        while(origin != null) {
            list.add(origin);
            origin = origin.next;
        }
        origin = head;

        int front = 1;
        int end = list.size()-1;

        for(int pointer = 1 ; pointer < list.size() ; pointer++) {
            if(pointer%2 == 1) {
                origin.next = list.get(end);
                origin = origin.next;
                end--;
            } else {
                origin.next = list.get(front);
                origin = origin.next;
                front++;
            }
        }
        if(list.size() % 2 == 0)  list.get(front).next = null;
        else list.get(end).next = null;
    }
}