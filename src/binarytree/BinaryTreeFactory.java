package binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * User: shoubhik Date: 14/12/12 Time: 9:14 PM
 */
public class BinaryTreeFactory {

    public static  enum BINARY_TREE {
        VALID_BST, INVALID_BST , BINARY_TREE
    }

    public static BinaryTree getBinaryTree(BINARY_TREE bt){
        BinaryTree binaryTree = null;
        BinaryTree.Node left = null;
        BinaryTree.Node right = null;
        switch(bt){
            case VALID_BST:
                return new TrivialBinaryTreeConstructor(new BinaryTree()).construct();
            case INVALID_BST:
               binaryTree = new BinaryTree(10);
               // level 1
               left = binaryTree.getNewNode(5);
               binaryTree.addAsLeftChild(binaryTree.getRoot(), left);
               right = binaryTree.getNewNode(15);
               binaryTree.addAsRightChild(binaryTree.getRoot(), right);
               // level 2
               binaryTree.addAsLeftChild(right, binaryTree.getNewNode(6));
               binaryTree.addAsRightChild(right, binaryTree.getNewNode(20));
               return binaryTree;
            case BINARY_TREE:
                binaryTree = new BinaryTree(1);
                left = BinaryTree.getNewNode(2);
                right = BinaryTree.getNewNode(3);
                binaryTree.addAsLeftChild(binaryTree.getRoot(), left);
                binaryTree.addAsRightChild(binaryTree.getRoot(), right);

                left.left = BinaryTree.getNewNode(4);
                left.right = BinaryTree.getNewNode(5);
                right.left = BinaryTree.getNewNode(6);
                right.right = BinaryTree.getNewNode(7);

                left = left.left;
                left.left = BinaryTree.getNewNode(8);
                left.right = BinaryTree.getNewNode(9);

                right = left.right;
                right.left = BinaryTree.getNewNode(10);
                right.right = BinaryTree.getNewNode(11);

                return binaryTree;
        }
        throw new IllegalArgumentException("invalid argument");
    }

}
