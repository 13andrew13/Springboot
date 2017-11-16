package my.proj.DAO;

import my.proj.model.Order;
import my.proj.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDAO {
    public User createUser(String name, String surname);
    public User deleteUser(String name, String surname, long id);
    public User updateUser(String field,String value,long id);
    public User addOrder(Order order, long id);
    public User getUserByID(long id);
    public User getUserByName(String name);
}
