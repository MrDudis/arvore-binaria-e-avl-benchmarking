import structures.AVLTree;
import structures.BinaryTree;

import java.util.Scanner;

public class Main {

    private static final int samples = 100000;
    private static final int time = 10000;

    public static void main(String[] args) {

        System.out.println("Benchmarking\n");

        System.out.println("1. Binary Tree");
        System.out.println("2. AVL Tree\n");

        System.out.print("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                binaryTree();
                break;
            case 2:
                avlTree();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

    }

    public static void binaryTree() {

        System.out.println("\nBinary Tree\n");

        // Create a binary tree
        System.out.println("Creating a binary tree...");
        BinaryTree binaryTree = new BinaryTree();

        // Wait 2 seconds
        System.out.println("Waiting " + time / 1000 + " seconds...\n");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long startTime = System.currentTimeMillis();

        // Insert random numbers into the binary tree
        System.out.println("Inserting " + samples + " random numbers into the binary tree...");
        for (int i = 0; i < samples; i++) {
            binaryTree.insert((int) (Math.random() * 100));
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Inserting " + samples + " random numbers into the binary tree took " + (endTime - startTime) + " milliseconds.\n");

        // Wait 5 seconds
        System.out.println("Waiting " + time / 1000 + " seconds...\n");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        startTime = System.currentTimeMillis();

        // Search for random numbers in the binary tree
        System.out.println("Searching for " + samples + " random numbers in the binary tree...");
        for (int i = 0; i < samples; i++) {
            binaryTree.search((int) (Math.random() * 100));
        }

        endTime = System.currentTimeMillis();

        System.out.println("Searching for " + samples + " random numbers in the binary tree took " + (endTime - startTime) + " milliseconds.\n");

        // Wait 5 seconds
        System.out.println("Waiting " + time / 1000 + " seconds...\n");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        startTime = System.currentTimeMillis();

        // Remove random numbers from the binary tree
        System.out.println("Removing " + samples + " random numbers from the binary tree...");
        for (int i = 0; i < samples; i++) {
            binaryTree.remove((int) (Math.random() * 100));
        }

        endTime = System.currentTimeMillis();

        System.out.println("Removing " + samples + " random numbers from the binary tree took " + (endTime - startTime) + " milliseconds.\n");

        main(null);

    }

    public static void avlTree() {

        System.out.println("\nAVL Tree\n");

        // Create a binary tree
        System.out.println("Creating a AVL tree...");
        AVLTree avlTree = new AVLTree();

        // Wait 2 seconds
        System.out.println("Waiting " + time / 1000 + " seconds...\n");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long startTime = System.currentTimeMillis();

        // Insert random numbers into the binary tree
        System.out.println("Inserting " + samples + " random numbers into the AVL tree...");
        for (int i = 0; i < samples; i++) {
            avlTree.insert((int) (Math.random() * 100));
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Inserting " + samples + " random numbers into the AVL tree took " + (endTime - startTime) + " milliseconds.\n");

        // Wait 5 seconds
        System.out.println("Waiting " + time / 1000 + " seconds...\n");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        startTime = System.currentTimeMillis();

        // Search for random numbers in the binary tree
        System.out.println("Searching for " + samples + " random numbers in the AVL tree...");
        for (int i = 0; i < samples; i++) {
            avlTree.search((int) (Math.random() * 100));
        }

        endTime = System.currentTimeMillis();

        System.out.println("Searching for " + samples + " random numbers in the AVL tree took " + (endTime - startTime) + " milliseconds.\n");

        // Wait 5 seconds
        System.out.println("Waiting " + time / 1000 + " seconds...\n");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        startTime = System.currentTimeMillis();

        // Remove random numbers from the binary tree
        System.out.println("Removing " + samples + " random numbers from the AVL tree...");
        for (int i = 0; i < samples; i++) {
            avlTree.remove((int) (Math.random() * 100));
        }

        endTime = System.currentTimeMillis();

        System.out.println("Removing " + samples + " random numbers from the AVL tree took " + (endTime - startTime) + " milliseconds.\n");

        main(null);

    }

}