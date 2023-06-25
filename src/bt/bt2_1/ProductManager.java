package bt.bt2_1;

import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private static final ProductController productController = new ProductController();

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("==================Menu========================");
            System.out.println("1.Thêm sản phẩm:");
            System.out.println("2.Hiển thị danh sách sản phẩm:");
            System.out.println("3.Sửa sản phẩm: ");
            System.out.println("4.Xóa sản phẩm:");
            System.out.println("5.Tìm kiếm:");
            System.out.println("6.Sắp xếp:");
            System.out.println("7.Thoát!");
            System.out.println("Nhập lựa chọn của bạn:");
            choice = Config.getInteger();
            switch (choice) {
                case 1:
                    creatProduct();
                    break;
                case 2:
                    getProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchByName();
                    break;
                case 6:
                    sortMenu();
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại lựa chọn:");
            }
        }
    }

    public static void sortMenu() {
        while (true) {
            System.out.println("====================SortMenu========================");
            System.out.println("1.Tăng dần theo giá:");
            System.out.println("2.Giảm dần theo giá:");
            System.out.println("3.Quay lại:");
            System.out.println("Nhập lựa chọn:");
            int choice = Config.getInteger();
            switch (choice) {
                case 1:
                    sortUp();
                    break;
                case 2:
                    sortDown();
                case 3:
                    return;
            }
        }
    }

    public static void creatProduct() {
        System.out.println("Nhập số lượng sản phẩm cần thêm mới:");
        int n = Config.getInteger();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sản phẩm thứ: " +(i+1));
            Product newProduct = new Product();
            int newId = productController.newId();
            newProduct.setId(newId);
            System.out.println("New ID :" + newId);
            newProduct.inputData();
            productController.save(newProduct);
            System.out.println("Thêm sản phẩm thành công!!");
        }
    }

    public static void getProduct() {
        if (productController.getSize() == 0) {
            System.out.println("Chưa có sản phẩm nào!!!");
        }
        for (Product product : productController.getAll()) {
            product.displayData();
        }
    }

    public static void editProduct() {
        System.out.println("Nhập id sản phẩm cần sửa:");
        int id = Config.getInteger();
        Product editProduct = productController.findById(id);
        if (editProduct == null) {
            System.out.println("Không tìm thấy sản phẩm :");
            return;
        }
        System.out.println("Sản phẩm cần sửa là:");
        editProduct.displayData();
        editProduct.inputData();
        productController.save(editProduct);
        System.out.println("Sửa thành công :");
    }

    public static void deleteProduct() {
        System.out.println("Nhập id sản phẩm cần xóa:");
        int id = Config.getInteger();
        productController.delete(productController.findById(id));
        System.out.println("Xóa thành công :");
    }

    public static void searchByName() {
        System.out.println("Nhập tên sản phẩm tìm kiếm:");
        String name = Config.getString();
        boolean flag = false;
        for (Product product : productController.getAll()) {
            if (product.getName().equals(name)) {
                System.out.println("Sản phẩm tìm kiếm: ");
                product.displayData();
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Không tìm thấy sản phẩm!!!");
        }
    }

    public static void sortUp() {
        Collections.sort(productController.getAll(), new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Integer.compare(p1.getQuantity(), p2.getQuantity());
            }

        });
        getProduct();
    }

    public static void sortDown() {
        Collections.sort(productController.getAll(), new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Integer.compare(p2.getQuantity(), p1.getQuantity());
            }
        });
        getProduct();
    }
}
