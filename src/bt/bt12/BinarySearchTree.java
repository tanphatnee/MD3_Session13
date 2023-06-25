package bt.bt12;

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

    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            // Nút cần xóa là nút lá hoặc chỉ có một con
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Nút cần xóa có hai con
            root.value = minValue(root.right);

            // Xóa phần tử thay thế từ cây con bên phải
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    private int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    public void inorderTraversal() {
        inorderTraversalRec(root);
    }

    private void inorderTraversalRec(Node root) {
        if (root != null) {
            inorderTraversalRec(root.left);
            System.out.print(root.value + " ");
            inorderTraversalRec(root.right);
        }
    }

}
