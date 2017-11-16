package my.proj.model;


import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

public class User {

    private long id;

    private String name;

    private String surname;

    private List<Order> orders;


    public User(String name,String surname) {
        this.name = name;
        this.surname = surname;
        orders=new ArrayList<>();
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public List<Order> getOrders(){
        return orders;
    }

}
