package org.senecarus.problems;

import org.senecarus.types.ListNode;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        byte carry = 0;

        ListNode head = null;
        ListNode previous = null;
        while (l1 != null || l2 != null || carry > 0) {

            // using bytes because The number of nodes in each linked list is in the range [1, 100]
            byte v1 = (byte) (l1 != null ? l1.val : 0);
            byte v2 = (byte) (l2 != null ? l2.val : 0);

            byte s = (byte) (v1 + v2 + carry);
            carry = (byte) (s / 10);
            s = (byte) (s % 10);

             if (head == null) {
                 previous = head = new ListNode(s);

             } else {

                 previous = previous.next = new ListNode(s);
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
