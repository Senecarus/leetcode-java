package org.senecarus.utils;

import java.util.Random;

import org.senecarus.types.ListNode;

public class LinkedListGenerator {

    private static Random rand = new Random();

    public static ListNode generateRandList(long length) {

        if (length == 0)
            return null;

        ListNode head = new ListNode(rand.nextInt(10));

        ListNode lastNode = generateRandListReq(length, head);

        return head;

    }

    private static ListNode generateRandListReq(long length, ListNode prevNode) {

        if (length == 0)
            return prevNode;

        ListNode node = new ListNode(rand.nextInt(10));
        prevNode.next = node;

        return generateRandListReq(length - 1, node);

    }

    public static ListNode generateListReq(String seq, ListNode prevNode, ListNode head) {

        if (seq.length() == 0)
            return head;

        int val = Character.getNumericValue(seq.charAt(0));
        ListNode node = new ListNode(val);
        prevNode.next = node;
        return generateListReq(seq.substring(1), node, head);

    }

    public static ListNode generateList(String seq) {

        if (seq.length() == 0)
            return null;

        ListNode head = new ListNode(Character.getNumericValue(seq.charAt(0)));
        return generateListReq(seq.substring(1), head, head);

    }


    public static void printList(ListNode node) {

        if (node == null) {
            System.out.println();
            return;
        }

        System.out.print("(");
        System.out.print(node.val);
        System.out.print(")");

        printList(node.next);

    }

}
