package bt.bt11;

public class NodeTree<T> {
    private T element;
    private NodeTree<T> left;
    private NodeTree<T> right;

    public NodeTree() {
    }

    public NodeTree(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public NodeTree<T> getLeft() {
        return left;
    }

    public void setLeft(NodeTree<T> left) {
        this.left = left;
    }

    public NodeTree<T> getRight() {
        return right;
    }

    public void setRight(NodeTree<T> right) {
        this.right = right;
    }

    public void postOrder(NodeTree<T> node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.element);
    }
}
