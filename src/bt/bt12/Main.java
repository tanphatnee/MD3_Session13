package bt.bt12;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Cây tìm kiếm nhị phân ban đầu:");
        bst.inorderTraversal();

        bst.delete(30);
        System.out.println("\nCây tìm kiếm nhị phân sau khi xóa 30:");
        bst.inorderTraversal();
    }
}
