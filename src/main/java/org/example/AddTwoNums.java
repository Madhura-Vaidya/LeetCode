package org.example;

public class AddTwoNums {

    public static void main(String[] args){
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        l4.next = l5;
        l5.next = l6;
        ListNode head = addTwoNumbers(l1, l4);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }



    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
        /*ListNode dummyHead = new ListNode();
        int carry = 0;
        while (firstNum !=  null || secondNum != null || carry !=0){
            int sum = 0;
            int digit1 = 0;
            int digit2 = 0;
            if(firstNum !=null){
                 digit1 = firstNum.val ;
                firstNum = firstNum.next;

            }
            if(secondNum != null){
                digit2 = secondNum.val ;
                secondNum = secondNum.next;
            }
            sum = digit1 + digit2 + carry;
            carry = sum/10;
            dummyHead.val = sum % 10;
            System.out.println("The value of the node is"+dummyHead.val);
            dummyHead.next = new ListNode();
            dummyHead = dummyHead.next;





        }
        return dummyHead;*/

    }



}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
