package org.example;

import java.util.HashSet;

public class CyclicList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static boolean hasCycle(ListNode head) {
        ListNode current  = head;
        HashSet<ListNode> set = new HashSet<>();
        while(current.next != null){
            if(!set.contains(current))
                set.add(current);
            else
                return true;

        }
        return false;
    }
}
