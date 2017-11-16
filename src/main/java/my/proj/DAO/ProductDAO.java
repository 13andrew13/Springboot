package my.proj.DAO;

import my.proj.model.Product;

public interface ProductDAO {
    public Product createProduct(String name,String description,double price );
    public Product deleteProduct(long id);
    public Product updateProduct(String parameter,String value,long id) throws Exception;
    public Product getProductByID(long id);
}
