package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] numbers = {14, 11, 5, 8, 16, 15, 18, 23, 22, 27, 24, 150};
        for (int i : numbers){
            addNode(i, root);
        }
        dfs(root);
    }

    public static void dfs(Node root) {
        if (root == null) {
            return;
        }
        dfs(root.getLeft());
        System.out.printf("%d ", root.getValue());
        dfs(root.getRight());
    }

     public static void addNode(int value, Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Argument isn't correct");
        }
        if (value < root.getValue()) {
            if (root.getLeft() == null) {
                root.setLeft(new Node(value));
            } else {
                addNode(value, root.getLeft());
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(new Node(value));
            } else {
                addNode(value, root.getRight());
            }
        }
    }
}

class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}