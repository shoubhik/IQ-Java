package binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * User: shoubhik Date: 14/12/12 Time: 9:14 PM
 */
public class BinaryTreeFactory {

    public static  enum BINARY_TREE {
        VALID_BST, INVALID_BST
    }

    public static BinaryTree getBinaryTree(BINARY_TREE bt){
        switch(bt){
            case VALID_BST:
                return new TrivialBinaryTreeConstructor(new BinaryTree()).construct();
            case INVALID_BST:
               BinaryTree binaryTree = new BinaryTree(10);
               // level 1
               BinaryTree.Node left = binaryTree.getNewNode(5);
               binaryTree.addAsLeftChild(binaryTree.getRoot(), left);
               BinaryTree.Node right = binaryTree.getNewNode(15);
               binaryTree.addAsRightChild(binaryTree.getRoot(), right);
               // level 2
               binaryTree.addAsLeftChild(right, binaryTree.getNewNode(6));
               binaryTree.addAsRightChild(right, binaryTree.getNewNode(20));
               return binaryTree;

        }
        throw new IllegalArgumentException("invalid argument");
    }

}
