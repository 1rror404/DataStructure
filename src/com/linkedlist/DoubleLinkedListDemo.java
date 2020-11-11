package com.linkedlist;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        System.out.println("1");
        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
        DoubleListNode node1=new DoubleListNode(1,"宋江");
        DoubleListNode node2=new DoubleListNode(2,"卢俊义");
        DoubleListNode node3=new DoubleListNode(3,"吴用");

        doubleLinkedList.AddListNode(node1);
        doubleLinkedList.AddListNode(node2);
        doubleLinkedList.AddListNode(node3);

        doubleLinkedList.ShowDoubleLinkedList();
    }
}
