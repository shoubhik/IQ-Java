package binarytree;

/**
 * Created with IntelliJ IDEA. User: shoubhik Date: 18/11/12 Time: 11:31 AM To
 * change this template use File | Settings | File Templates.
 */
public class BinaryTree {

    public static class Node{
        public int data;
        public Node left;
        public Node right;
        public Node nextRight;
        public Node nextLeft;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            this.nextRight = null;
            this.nextLeft = null;
        }
    }

    private Node root;

    public BinaryTree(){
        root  = null;

    }

    public BinaryTree(Integer data){
        this.root = new Node(data);

    }

    public Node getNewNode(int data){
        return new Node(data);
    }

    public void addAsLeftChild(Node parent, Node child){
        assert(parent != null);
        parent.left = child;
    }

    public void addAsRightChild(Node parent, Node child){
        assert(parent != null);
        parent.right = child;
    }

    public Node getRoot(){
        return this.root;
    }

    public void setRoot(int data){
        this.root = new Node(data);
    }
}
