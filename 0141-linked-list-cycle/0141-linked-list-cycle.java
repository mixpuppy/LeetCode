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
public class Solution {
    // 토끼와 거북이 알고리즘
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        // 2 포인터를 두어 느린건 한포인트씩, 빠른건 2포인트 씩 움직임
        // 순환 구조를 가지고 있다면 두 포인터는 언젠간 만남.
        // O(N) 시간복잡도.
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }
    
    // 해쉬셋을 사용한 방문여부 확인 방법 
    // 시간복잡도는 같으나 공간복잡도가 O(N) 으로 추가된다. 리스와 동일한 공간 추가가 필요
    public boolean hasCycle2(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}