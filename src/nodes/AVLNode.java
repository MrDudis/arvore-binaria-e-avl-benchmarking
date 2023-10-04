package nodes;

public class AVLNode {

    private int data;

    private AVLNode left;
    private AVLNode right;

    private int height;

    public AVLNode(int data) {
        this.data = data;
        this.height = 1;
    }

    public int getData() {
        return data;
    }

    public AVLNode getLeft() {
        return left;
    }

    public AVLNode getRight() {
        return right;
    }

    public int getHeight() {
        return height;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(AVLNode left) {
        this.left = left;
    }

    public void setRight(AVLNode right) {
        this.right = right;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
