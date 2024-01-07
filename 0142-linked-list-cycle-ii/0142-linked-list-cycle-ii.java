/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// 해시셋 이용한 방법은 공간복잡도가 O(N) 으로 높으나
// 코드가 간결함.
public class Solution {
    public ListNode detectCycle2(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head != null) {
            if(set.contains(head)) return head;
            set.add(head);
            head = head.next;
        }
        return null;
    }
    // 토끼 거북이. 시간복잡도 O(N) 공간복잡도 O(1)
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {       
                slow = head;
                // 이부분이 이해가 잘 안가 직접 그리며 해봣다.
                // 이렇게 하면 반복의 시작점에서 만나긴 하는데 정확한 원리는 이해가 아직 안갔다.
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
