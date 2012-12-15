package binarytree;

/**
 * User: shoubhik Date: 11/12/12 Time: 12:45 PM
 */
public abstract class BaseBinaryTreeOrderTraversal {
    public static enum Order{
        INORDER, PREPORDER, POSTORDER
    }

    protected Order order;

    protected abstract void takeAction(BinaryTree.Node node);

    protected void inOrder(BinaryTree.Node node){
        if(node == null) return;
        inOrder(node.left);
        takeAction(node);
        inOrder((node.right));
    }

    protected void preOrder(BinaryTree.Node node){
        if(node == null) return;
        takeAction(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    protected void postOrder(BinaryTree.Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        takeAction(node);
    }

    protected void walk(Order order, BinaryTree bt) {
        switch(order){
            case INORDER:
                inOrder(bt.getRoot());
                break;
            case PREPORDER:
                preOrder(bt.getRoot());
                break;
            case POSTORDER:
                postOrder(bt.getRoot());
                break;
        }
    }
}