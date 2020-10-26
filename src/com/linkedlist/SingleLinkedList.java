package com.linkedlist;

public class SingleLinkedList {
    //先初始化一个头节点
    private ListNode head = new ListNode(0, "");

    public ListNode getHead() {
        return head;
    }

    //显示单链表
    public void showLinkedList() {
        if (isEmpty()) {
            System.out.println("链表为空");
            return;
        }
        ListNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp.no+"  "+temp.name);
            temp=temp.next;

        }
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return head.next == null;
    }

    //单链表添加节点
    public void addLinkedList(ListNode node) {
        ListNode temp = getHead();
        while (true) {
            //找到链表最后
            if (temp.next == null) {
                break;
            }
            //如果没有找到最后temp后移
            temp = temp.next;
        }
        //找到链表最后把node放在后面
        temp.next = node;

    }

}
