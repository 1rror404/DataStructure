package com.linkedlist;

public class DoubleLinkedList {
    //初始化一个头节点
    DoubleListNode head = new DoubleListNode(0, "");

    //遍历双链表
    public void ShowDoubleLinkedList() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        DoubleListNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp.id + "   " + temp.name);
            temp = temp.next;
        }
    }

    //双链表添加节点
    public void AddListNode(DoubleListNode node) {
        DoubleListNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }

    //双链表移除节点
    public void RemoveListNode(int id) {
        DoubleListNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.id == id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.pre.next = temp.next;
        } else {
            System.out.println("要删除的节点不存在！");
        }
    }

    public void UpdateListNode(DoubleListNode node) {
        DoubleListNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.id == node.id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = node.name;
        } else {
            System.out.println("未找到要删除的节点！");
        }
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return head.next == null;
    }
}
