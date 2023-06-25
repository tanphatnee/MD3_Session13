package bt.bt2_1;

import java.util.ArrayList;

public class ProductController {
    private ProductService productService = new ProductService();

    public ArrayList<Product> getAll(){
        return productService.getProducts();
    }
    public  int getSize(){
        return productService.getSize();
    }
    public  void save(Product product){
        productService.save(product);
    }
    public  void delete(Product product){
        productService.delete(product);
    }
    public int newId(){
        return productService.newId();
    }
    public Product findById(int id){
        return productService.findById(id);
    }
}
