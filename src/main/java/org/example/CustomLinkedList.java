package org.example;

public class CustomLinkedList {
    Node head;

    public void displayContent(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
    }

    public void deleteBackHalf(){
        if(head == null || head.next == null){
            head = null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
    }

    public int sum(){
        int sum = 0;
        if(head == null){
          return sum;
        }
        Node current = head;

        while (current != null){
            sum = sum+ current.data;
            current = current.next;
        }

        return sum;

    }
}
