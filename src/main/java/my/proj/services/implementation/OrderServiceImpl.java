package my.proj.services.implementation;

import my.proj.DAO.OrderDAO;
import my.proj.DAO.implementation.OrderDAOImpl;
import my.proj.services.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class OrderServiceImpl implements OrderService {

    OrderDAO orderDAO= OrderDAOImpl.getInstance();

    @Override
    public String checkOrder(long id) {
        return null;
    }

    @Override
    public boolean completeOrder( long id) {
        return false;
    }
}
