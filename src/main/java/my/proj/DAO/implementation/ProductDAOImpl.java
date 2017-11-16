package my.proj.DAO.implementation;

import my.proj.DAO.ProductDAO;
import my.proj.exceptions.NoParameterExeption;
import my.proj.model.Order;
import my.proj.model.Product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {
    List<Product> products=new ArrayList<>();
    private static ProductDAOImpl instance = new ProductDAOImpl();

    public static ProductDAOImpl getInstance() {
        return instance;
    }



    @Override
    public Product createProduct(String name,String description, double price) {
        Product product = new Product();
        product.setDescription(description);
        product.setName(name);
        product.setPrice(price);
        products.add(product);
        return product;
    }

    @Override
    public Product deleteProduct(long id) {
        Product product = getProductByID(id);
        products.remove(product);
        return product;

    }

    @Override
    public Product updateProduct(String parameter, String value, long id) throws Exception {
        Product product = getProductByID(id);
        if(parameter.equals("description")){
            product.setDescription(value);
        }
        else if (parameter.equals("price")){
            try{
                product.setPrice(Double.parseDouble(value));
            }catch (Exception ex){

            }
        }
        else if(parameter.equals("name")){
            product.setName(value);
        }
        else{
            throw new NoParameterExeption();
        }
        return product;

    }



    @Override
    public Product getProductByID(long id) {
        Product product = null;
        for (Product product1 : products) {
            if(product1.getId()==id){
                product= product1;
                break;
            }
        }
        return product;
    }
}
