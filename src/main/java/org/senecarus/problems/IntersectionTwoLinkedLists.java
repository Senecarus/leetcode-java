package org.senecarus.problems;

import java.util.HashSet;
import java.util.Set;

import org.senecarus.types.ListNode;

public class IntersectionTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodes = new HashSet<>();
        while (headA != null || headB != null) {
            if (headA != null) {
                if (nodes.contains(headA))
                    return headA;
                else {
                    nodes.add(headA);
                    headA = headA.next;
                }
            }

            if (headB != null) {
                if (nodes.contains(headB))
                    return headB;
                else {
                    nodes.add(headB);
                    headB = headB.next;
                }
            }

        }

        return null;
    }

}
