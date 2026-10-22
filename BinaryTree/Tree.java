package BinaryTree;

import java.util.*;

public class Tree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // ! DFS
        // PreOrder Traversal O(n)
        public void traversePreOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            traversePreOrder(root.left);
            traversePreOrder(root.right);
        }

        // InOrder Traversal O(n)
        public void traverseInOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            traverseInOrder(root.left);
            System.out.print(root.data + " ");
            traverseInOrder(root.right);
        }

        // PostOrder Traversal O(n)
        public void traversePostOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            traversePostOrder(root.left);
            traversePostOrder(root.right);
            System.out.print(root.data + " ");
        }

        // ! BFS
        // LevelOrder Traversal O(n)
        public void traverseLevelOrder(Node root) {
            if (root == null)
                return;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (!queue.isEmpty()) {
                Node curr = queue.remove();
                if (curr == null) {
                    System.out.println();
                    if (queue.isEmpty()) {
                        break;
                    } else
                        queue.add(null);
                } else {
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }
            }
        }
    }

    // Height of a tree

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // System.out.print("Pre Order: ");
        // tree.traversePreOrder(root);
        // System.out.println();
        // System.out.print("In Order: ");
        // tree.traverseInOrder(root);
        // System.out.println();
        // System.out.print("Post Order: ");
        // tree.traversePostOrder(root);
        // System.out.println();
        // System.out.println();
        System.out.println("Level Order Traversal");
        tree.traverseLevelOrder(root);
        System.out.println();
    }
}
