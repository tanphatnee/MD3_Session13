package bt.bt2_1;

import java.util.ArrayList;

public class ProductService {
    ArrayList<Product> listProducts;

    public ProductService() {
        listProducts = new ArrayList<>();
    }
    public ArrayList getProducts(){
        return listProducts;
    }
    public int getSize(){
        return listProducts.size();
    }
     public int newId(){
        int max= 0;
         for (Product product : listProducts) {
             if(product.getId()>max){
                 max=product.getId();
             }
         }
         return max+1;
     }

     public Product findById(int id){
         for (Product product : listProducts) {
             if(product.getId()==id){
                 return product;
             }
         }
         return null;
     }

     public void save(Product product){
        if(findById(product.getId())==null){
            listProducts.add(product);
        }else{
            listProducts.set(listProducts.indexOf(findById(product.getId())), product);
        }
     }

     public void delete(Product product){
        if(findById(product.getId())== null){
             System.out.println("Không tìm thấy sản phẩm:");
             return;
         }else{
            listProducts.remove(product);
         }
     }

}
