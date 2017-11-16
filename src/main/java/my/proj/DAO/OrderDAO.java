package my.proj.DAO;

import my.proj.model.Order;
import my.proj.model.Product;
import my.proj.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface OrderDAO {
    public void createOrder(User user,Product... product);
    public void deleteOrder(long id);
    public Order getOrderByID(long id);
    public List<Order> getUserOrders(User user);
}
