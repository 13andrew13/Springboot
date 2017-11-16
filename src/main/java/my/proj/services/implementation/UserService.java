package my.proj.services.implementation;

import my.proj.DAO.OrderDAO;
import my.proj.DAO.UserDAO;
import my.proj.DAO.implementation.UserDAOImpl;
import my.proj.model.Order;
import my.proj.model.Product;
import my.proj.model.User;
import my.proj.services.interfaces.UserServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  implements UserServiceInt{
    @Autowired
    private UserDAO userDAO = UserDAOImpl.getInstance();


    @Override
    public void signup(String name, String surname) throws Exception {
        userDAO.createUser(name,surname);

    }

    @Override
    public void login(String name, String surname) {

    }

    @Override
    public Order createOrder() {
        return null;
    }

    @Override
    public void cancelOrder(long id) {

    }

    @Override
    public List<Order> getListOfOrders(long id) {
        return null;
    }
}