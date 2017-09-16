/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}   

class Solution {
    

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dumHead = new ListNode(0);
        ListNode p = dumHead;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if(l1 != null) {
            p.next = l1;
        }
        if(l2 != null) {
            p.next = l2;
        }

        return dumHead.next;
    }
}

class MergeTwoSortedLists {
    public static void main(String[] args) {
        
    }
}