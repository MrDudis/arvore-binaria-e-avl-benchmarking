package nodes;

public class BinaryNode {

    private int value;

    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int value) {
        this.value = value;

        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return this.value;
    }

    public BinaryNode getLeft() {
        return this.left;
    }

    public BinaryNode getRight() {
        return this.right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

}
