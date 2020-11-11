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
            System.out.println(temp.no + "  " + temp.name);
            temp = temp.next;
        }
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return head.next == null;
    }

    //单链表添加节点
    public void addNode(ListNode node) {
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

    //按照no的顺序添加节点（升序）
    public void orderByAddNode(ListNode node) {
        ListNode temp = getHead();
        boolean flag = false; //用一个标志代表是否找到要添加节点的位置
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > node.no) {
                break;
            } else if (temp.next.no == node.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("节点已存在");
        } else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    //单链表移除节点
    public void removeNode(int id) {
        ListNode temp = getHead();
        boolean flag = false;  //用一个标志代表是否找到要移除的节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;  //将待移除的节点的前一个节点指向 要移除节点的下一个节点。 被移除的节点会被回收
        } else {
            System.out.println("没有找到要删除的节点！");
        }
    }

    //单链表修改节点
    public void updateNode(ListNode node) {
        ListNode temp = getHead();
        boolean flag = false; //判断是否找到节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.no == node.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = node.name;
        } else {
            System.out.println("未找到该节点");
        }
    }

}
