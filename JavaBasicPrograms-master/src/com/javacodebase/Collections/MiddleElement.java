package com.javacodebase.Collections;

import java.util.LinkedList;
import java.util.List;


class ListNode{
    int value;
    ListNode next;
    ListNode(int value){
        this.value= value;
        this.next= null;
    }
}
public class MiddleElement {
    ListNode head;

    public int findMiddleElement(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr.value;
    }



    public static void main(String[] args) {
        MiddleElement listValues= new MiddleElement();
        ListNode node1= new ListNode(1);
        ListNode node2= new ListNode(3);
        ListNode node3= new ListNode(5);
        ListNode node4= new ListNode(7);
        ListNode node5= new ListNode(9);

        listValues.head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next= node5;

        int middleElement= listValues.findMiddleElement();
        System.out.println(middleElement);

    }
}


//        listValues.add(1);
//        listValues.addFirst(2);
//        listValues.add(6);
//        listValues.add(7);
//        listValues.add(9);
//        listValues.add(10);
//        listValues.add(15);
//        listValues.addLast(3);
//
//        for(int i:listValues){
//            System.out.print(i +" ");
//        }
//        System.out.println("Middle Element of the linked list:");
//        System.out.println(listValues.get(listValues.size()/2 ));





