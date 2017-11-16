package my.proj.services.interfaces;

import my.proj.model.Order;
import my.proj.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserServiceInt {

    public void signup(String name, String surname) throws Exception;
    public void login(String name,String surname);
    public Order createOrder();
    public void cancelOrder(long id);
    List<Order> getListOfOrders(long id);


}
