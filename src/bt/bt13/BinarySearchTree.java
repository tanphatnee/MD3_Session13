package bt.bt13;

public class BinarySearchTree {
    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    public void preorderTraversal() {
        preorderTraversalRec(root);
    }

    private void preorderTraversalRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderTraversalRec(root.left);
            preorderTraversalRec(root.right);
        }
    }
}
