package binarytree.questions;

import binarytree.BinaryTree;
import binarytree.TrivialBinaryTreeConstructor;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA. User: shoubhik Date: 18/11/12 Time: 1:47 PM To
 * change this template use File | Settings | File Templates.
 */
public class IterativeInorderTraversal {
    public static void printIterativeInorderTraversal(BinaryTree tree){
        Stack<BinaryTree.Node> stack = new Stack<BinaryTree.Node>();
        BinaryTree.Node current = tree.getRoot();
        while(!stack.isEmpty() || current != null){
            if(current != null){
                stack.push(current);
                current = current.left;
            }
            else{
                current = stack.peek();
                stack.pop();
                System.out.print(current.data + " ");
                current = current.right;
            }
        }

    }

    public static void main(String[] args) {
        TrivialBinaryTreeConstructor tbc = new
                TrivialBinaryTreeConstructor(new BinaryTree());
        BinaryTree bt = tbc.construct();
        printIterativeInorderTraversal(bt);
    }
}
