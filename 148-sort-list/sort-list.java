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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head; // Base case

        // Step 1: Find the middle of the linked list
        ListNode mid = findMiddle(head);

        // Step 2: Split the list into two halves
        ListNode leftHalf = head;
        ListNode rightHalf = mid.next;
        mid.next = null; // Break the list

        // Step 3: Recursively sort both halves
        ListNode leftSorted = sortList(leftHalf);
        ListNode rightSorted = sortList(rightHalf);

        // Step 4: Merge the sorted halves
        return merge(leftSorted, rightSorted);
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Middle node
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }
}