package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BTNode root = binaryTree.createTree();
       boolean ret =  binaryTree.isCompleteTree(root);
        System.out.println(ret);
//        binaryTree.inOrderTraversal(root);
//        System.out.println("=============");
//        binaryTree.postOrderTraversal(root);
//        System.out.println("=============");
//        binaryTree.preOrderTraversal(root);
//        System.out.println("=============");
        
    }

}
