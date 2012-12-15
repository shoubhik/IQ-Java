package binarytree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * User: shoubhik Date: 11/12/12 Time: 1:54 PM]
 * serialize the binary tree in a preorder traversal
 */
public class BinaryTreeFileSerializer extends BaseBinaryTreeOrderTraversal
        implements BinaryTreeWriter {

    private String fileName;
    private FileWriter fstream;
    private BufferedWriter out;

    public BinaryTreeFileSerializer(String filename) throws IOException {
        this.order = Order.PREPORDER;
        this.fileName = filename;
        fstream = new FileWriter(filename);
        out = new BufferedWriter(fstream);
    }


    @Override
    public void write(BinaryTree bt) {
        super.walk(this.order, bt);
        try {
            out.close();
        } catch (IOException e) {
            throw new RuntimeException("unable to close out stream");
        }

    }

    @Override
    protected void takeAction(BinaryTree.Node node) {
        try {
            out.write(node.data + "\n");
        } catch (IOException e) {
            throw new RuntimeException(
                    "unable to write data for node = " + node.data + "at file" +
                            " = " + fileName);

        }
    }

    public static void main(String[] args) throws IOException {
        BinaryTreeConstructor btc = new TrivialBinaryTreeConstructor(new BinaryTree());
        BinaryTree bt = btc.construct();
        BinaryTreeWriter writer = new BinaryTreeFileSerializer("TrivialBinaryTree");
        writer.write(bt);
    }
}
