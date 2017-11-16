package my.proj.model;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class Order {

    private long id;

    private double price;

    private List<Product> products;

    private User user;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPrice(double price){
        this.price=price;

    }
    public void addProduct(Product product){
        products.add(product);
    }
}
