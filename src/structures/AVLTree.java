package structures;

import nodes.AVLNode;

public class AVLTree {

    private AVLNode root;

    public void insert(int data) {
        root = insert(root, data);
    }

    private AVLNode insert(AVLNode node, int data) {
        if (node == null) {
            return new AVLNode(data);
        }

        if (data < node.getData()) {
            node.setLeft(insert(node.getLeft(), data));
        } else if (data > node.getData()) {
            node.setRight(insert(node.getRight(), data));
        } else {
            return node;
        }

        node.setHeight(1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight())));

        int balance = getBalance(node);

        if (balance > 1) {
            if (data >= node.getLeft().getData()) { node.setLeft(leftRotate(node.getLeft())); }
            return rightRotate(node);
        }

        if (balance < -1) {
            if (data <= node.getRight().getData()) { node.setRight(rightRotate(node.getRight())); }
            return leftRotate(node);
        }

        return node;
    }

    public boolean search(int data) {
        return search(root, data);
    }

    private boolean search(AVLNode node, int data) {
        if (node == null) {
            return false;
        }

        if (data < node.getData()) {
            return search(node.getLeft(), data);
        } else if (data > node.getData()) {
            return search(node.getRight(), data);
        } else {
            return true;
        }
    }

    public void remove(int data) {
        root = remove(root, data);
    }

    private AVLNode remove(AVLNode node, int data) {
        if (node == null) {
            return node;
        }

        if (data < node.getData()) {
            node.setLeft(remove(node.getLeft(), data));
        } else if (data > node.getData()) {
            node.setRight(remove(node.getRight(), data));
        } else {
            if (node.getLeft() == null || node.getRight() == null) {
                AVLNode temp = (node.getLeft() != null) ? node.getLeft() : node.getRight();

                if (temp == null) {
                    temp = node;
                    node = null;
                } else {
                    node = temp;
                }
            } else {
                AVLNode temp = minValueNode(node.getRight());
                node.setData(temp.getData());
                node.setRight(remove(node.getRight(), temp.getData()));
            }
        }

        if (node == null) {
            return node;
        }

        node.setHeight(1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight())));

        int balance = getBalance(node);

        if (balance > 1) {
            if (getBalance(node.getLeft()) >= 0) {
                return rightRotate(node);
            } else {
                node.setLeft(leftRotate(node.getLeft()));
                return rightRotate(node);
            }
        }

        if (balance < -1) {
            if (getBalance(node.getRight()) <= 0) {
                return leftRotate(node);
            } else {
                node.setRight(rightRotate(node.getRight()));
                return leftRotate(node);
            }
        }

        return node;
    }

    private int getHeight(AVLNode node) {
        return (node != null) ? node.getHeight() : 0;
    }

    private int getBalance(AVLNode node) {
        return (node != null) ? getHeight(node.getLeft()) - getHeight(node.getRight()) : 0;
    }

    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.getLeft();
        AVLNode T2 = x.getRight();

        x.setRight(y);
        y.setLeft(T2);

        y.setHeight(1 + Math.max(getHeight(y.getLeft()), getHeight(y.getRight())));
        x.setHeight(1 + Math.max(getHeight(x.getLeft()), getHeight(x.getRight())));

        return x;
    }

    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.getRight();
        AVLNode T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);

        x.setHeight(1 + Math.max(getHeight(x.getLeft()), getHeight(x.getRight())));
        y.setHeight(1 + Math.max(getHeight(y.getLeft()), getHeight(y.getRight())));

        return y;
    }

    private AVLNode minValueNode(AVLNode node) {
        AVLNode current = node;

        while (current.getLeft() != null) {
            current = current.getLeft();
        }

        return current;
    }

}
