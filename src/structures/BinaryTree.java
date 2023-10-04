package structures;

import nodes.BinaryNode;

public class BinaryTree {

    private BinaryNode root;

    public BinaryTree() {
        this.root = null;
    }

    // 1. Insert

    public void insert(int value) {
        this.root = insertRecursive(this.root, value);
    }

    private BinaryNode insertRecursive(BinaryNode current, int value) {

        if (current == null) { return new BinaryNode(value); }

        if (value < current.getValue()) {
            current.setLeft(insertRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(insertRecursive(current.getRight(), value));
        }

        return current;

    }

    // 2. Search

    public boolean search(int value) {
        return searchRecursive(this.root, value);
    }

    private boolean searchRecursive(BinaryNode current, int value) {

        if (current == null) { return false; }

        if (value == current.getValue()) { return true; }

        return value < current.getValue()
                ? searchRecursive(current.getLeft(), value)
                : searchRecursive(current.getRight(), value);

    }

    // 3. Remove

    public void remove(int value) {
        this.root = removeRecursive(this.root, value);
    }

    private BinaryNode removeRecursive(BinaryNode current, int value) {

        if (current == null) { return null; }

        if (value < current.getValue()) {
            current.setLeft(removeRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(removeRecursive(current.getRight(), value));
        } else {

            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            } else if (current.getLeft() == null) {
                return current.getRight();
            } else if (current.getRight() == null) {
                return current.getLeft();
            } else {
                BinaryNode successor = findMinNode(current.getRight());

                current.setValue(successor.getValue());
                current.setRight(removeRecursive(current.getRight(), successor.getValue()));
            }

        }

        return current;
    }

    private BinaryNode findMinNode(BinaryNode current) {
        if (current.getLeft() == null) { return current; }
        return findMinNode(current.getLeft());
    }

}
