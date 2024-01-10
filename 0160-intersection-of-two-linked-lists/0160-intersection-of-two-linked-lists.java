/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode p1 = headA;
        ListNode p2 = headB;
        
        // 두 연결리스트의 길이가 다른경우 짧은 쪽이 먼저 끝에 다다라 긴쪽의 head 로 시작점을 옮김.
        // 긴쪽에서 다시 next 를 조회하고, 기존의 긴쪽이 끝에 다다를 시 짧은데서 시작하면
        // 두 노드가 만나게 되고 그 시점에 while 을 탈출함.
        while(p1 != p2) {
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }

        return p1;
    }
}