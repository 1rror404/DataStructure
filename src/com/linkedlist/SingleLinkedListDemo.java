package com.linkedlist;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, "宋江");
        ListNode node2 = new ListNode(2, "卢俊义");
        ListNode node3 = new ListNode(3, "吴用");
        ListNode node4 = new ListNode(4, "公孙胜");
        ListNode node5 = new ListNode(5, "关胜");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addNode(node1);
        singleLinkedList.addNode(node2);
        singleLinkedList.addNode(node3);

        singleLinkedList.orderByAddNode(node5);
        singleLinkedList.orderByAddNode(node4);

        ListNode newNode3 = new ListNode(3, "真没用");
        singleLinkedList.updateNode(newNode3);


        singleLinkedList.showLinkedList();


    }
}
