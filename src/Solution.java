/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val) {
//            ListNode delNode = head;
//            head = head.next;
//            delNode = null;
            head = head.next;
        }

        if(head == null) {
            return null;
        }

        ListNode prev = head;
        while(prev.next != null) {
            if(prev.next.val == val) {
//                ListNode delNode = prev.next;
//                prev.next = delNode.next;
//                delNode = null;
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }
        return head;
    }
};