package org.senecarus.tasks;

import org.senecarus.types.ListNode;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        ListNode head = null;
        ListNode previous = null;
        while (l1 != null || l2 != null || carry > 0) {

            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;

            int s = v1 + v2 + carry;
            carry = s / 10;
            s = s % 10;

            if (head == null) {
                head = new ListNode(s);
                previous = head;

            } else {

                ListNode current  = new ListNode(s);
                previous.next = current;
                previous = current;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;



        }


        return head;
    }

//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        return helper(l1,l2,0);
//    }
//    private static ListNode helper(ListNode l1, ListNode l2, int carry){
//        if(l1 == null && l2 == null){
//            if(carry == 1)  return new ListNode(1);
//            else    return null;
//        }
//
//        int sum = carry;
//        sum = (l1 == null)?sum:sum+l1.val;
//        sum = (l2 == null)?sum:sum+l2.val;
//
//        carry = sum / 10;
//        sum = sum % 10;
//
//        ListNode node = new ListNode(sum);
//        if(l1 == null)
//            node.next = helper(l1,l2.next,carry);
//        else if(l2 == null)
//            node.next = helper(l1.next,l2,carry);
//        else
//            node.next = helper(l1.next,l2.next,carry);
//        return node;
//
//    }
}
