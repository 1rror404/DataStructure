package com.queue;

public class ArrayQueue {
    private int maxSize; //队列最大容量
    private int head; //队列头
    private int foot;//队列尾
    private int[] arr;//用数组模拟队列

    //创建队列的构造器
    public ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        head = -1;  //指向队列头的前一个位置！！！
        foot = -1;  //指向队列尾，初始值设为-1
    }

    //显示队列所有数据
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i] + "");
        }

    }

    //判断队列是否满
    public boolean isFull() {
        return foot == maxSize - 1;  //队列尾是 队列最大容量-1 时为满
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return head == foot;
    }

    //添加队列
    public void addQueue(int num) {
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        head++; //head后移
        arr[head] = num;
    }

    //移除队列
    public int removeQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        foot++;
        return arr[foot];
    }
}
