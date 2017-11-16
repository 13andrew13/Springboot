package my.proj.DAO.implementation;

import my.proj.DAO.OrderDAO;
import my.proj.model.Order;
import my.proj.model.Product;
import my.proj.model.User;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl implements OrderDAO{
    List<Order> orders = new ArrayList<>();
    private static OrderDAOImpl instance = new OrderDAOImpl();
    private int counter=0;


    public static OrderDAOImpl getInstance(){
        return instance;
    }

    @Override
    public void createOrder(User user,Product... product) {
        Order order = new Order();
        order.setId(counter);
        order.setUser(user);
        for (Product product1 : product) {
        order.addProduct(product1);
        }
        orders.add(order);
        counter++;
    }

    @Override
    public void deleteOrder(long id) {
        for (Order order : orders) {
            if(order.getId()==id){
                orders.remove(order);
            }
        }


    }

    @Override
    public Order getOrderByID(long id) {
        for (Order order : orders) {
            if(order.getId()==id){
                return order;
            }
        }
        return  null;
    }

    @Override
    public List<Order> getUserOrders(User user) {
        List<Order> o=new ArrayList<>();
        for (Order order : orders) {
            if(order.getUser().equals(user)){
                o.add(order);
            }
        }
        return o;
    }


}
