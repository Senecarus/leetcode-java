package org.senecarus.problems;

import org.junit.Test;
import org.senecarus.types.ListNode;
import org.senecarus.utils.LinkedListGenerator;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {

        ListNode list1 = LinkedListGenerator.generateList("243");
        LinkedListGenerator.printList(list1);

        ListNode list2 = LinkedListGenerator.generateList("564");
        LinkedListGenerator.printList(list2);

        ListNode res = AddTwoNumbers.addTwoNumbers(list1, list2);
        LinkedListGenerator.printList(res);

    }
}