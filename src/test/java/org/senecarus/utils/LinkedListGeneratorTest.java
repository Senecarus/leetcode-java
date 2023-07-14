package org.senecarus.utils;

import org.junit.Test;
import org.senecarus.types.ListNode;

public class LinkedListGeneratorTest {

    @Test
    public void generateList() {

        LinkedListGenerator.printList(LinkedListGenerator.generateList("0"));
        LinkedListGenerator.printList(LinkedListGenerator.generateList("123"));


    }
}