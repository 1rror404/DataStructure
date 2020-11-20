package com.BinaryTree;

public class BinaryTree {

    //前序遍历，先输出根节点，然后遍历左子树和右子树
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.value + "   ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //中序遍历
    public void middleOrder(Node root) {
        if (root != null) {
            middleOrder(root.left);
            System.out.print(root.value + "  ");
            middleOrder(root.right);
        }
    }

    //后序遍历
    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + "  ");
        }
    }

    //添加节点
    public void addNode(Node node){
        if(node == null) {
            return;
        }


    }
}
