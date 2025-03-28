package org.example;

public class CustomLinkedListTest {

    public static void main(String[] args){
        CustomLinkedList list = new CustomLinkedList();
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(5);
        Node sixthNode = new Node(6);
        list.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;
        list.displayContent();
        //list.deleteBackHalf();
        System.out.println();
        System.out.println(list.sum());
       // list.displayContent();

    }
}
