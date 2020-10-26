package com.linkedlist;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, "宋江");
        ListNode node2 = new ListNode(2, "卢俊义");
        ListNode node3 = new ListNode(3, "吴用");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.showLinkedList();

        singleLinkedList.addLinkedList(node1);
        singleLinkedList.showLinkedList();
        singleLinkedList.addLinkedList(node2);
        singleLinkedList.addLinkedList(node3);
        singleLinkedList.showLinkedList();
    }
}
