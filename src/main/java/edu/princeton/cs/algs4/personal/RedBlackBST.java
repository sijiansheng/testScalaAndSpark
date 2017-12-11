package edu.princeton.cs.algs4.personal;

/**
 * Created by sijiansheng on 2017/12/5.
 */
public class RedBlackBST {

    private static Boolean RED = true;
    private static Boolean BLACK = false;

    private Node root;

    private class Node<Key, Value> {
        private Node left, right;
        private Key key;
        private Value value;
        private int size;
        private Boolean color;

        public Node(Node left, Node right, Key key, Value value, int size, Boolean color) {
            this.left = left;
            this.right = right;
            this.key = key;
            this.value = value;
            this.size = size;
            this.color = color;
        }
    }

    public RedBlackBST(Node root) {
        this.root = root;
    }

    private Boolean isRed(Boolean colar) {
        return colar == RED;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = x.left.color;
        x.left.color = RED;
        x.size = h.size;
        h.size = size(h.left) + size(h.right) + 1;
        return x;
    }

    private int size() {
        return size(root);
    }

    private int size(Node root) {
        return root.size;
    }
}
