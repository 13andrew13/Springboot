package my.proj.services.interfaces;

import my.proj.model.Order;
import org.springframework.stereotype.Service;


public interface OrderService {
    public String checkOrder(long id);
    public boolean completeOrder(long id);

}
