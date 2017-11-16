package my.proj.DAO.implementation;



import my.proj.DAO.UserDAO;

import my.proj.model.Order;
import my.proj.model.User;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public  class UserDAOImpl implements UserDAO {
    List<User> list=new ArrayList<>();
    private static UserDAOImpl instance = new UserDAOImpl();


    public static UserDAOImpl getInstance() {
        return instance;
    }

    @Override
    public User createUser(String name, String surname) {
        User user = new User(name,surname);
        list.add(user);
        return user;
    }

    @Override
    public User deleteUser(String name, String surname, long id) {
        for (User user : list) {
           if(user.getName().equals(name)&&user.getId()==id){
               list.remove(user);
               return user;
           }
        }
        return null;

    }

    @Override
    public User updateUser(String field, String value,long id) {
        for (User user : list) {
            if(user.getId()==id){
                if(field.equals("name")){
                    user.setName(value);
                }
                else if(field.equals("surname")){
                    
                }
            }
        }
    }

    @Override
    public User addOrder(Order order,long id) {
        for (User user : list) {
            if(user.getId()==id){
                user.addOrder(order);
                return user;
            }
        }
        return null;
    }

    @Override

    public User getUserByID(long id) {
        
        for (User user : list) {
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByName(String name) {
        for (User user : list) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}
