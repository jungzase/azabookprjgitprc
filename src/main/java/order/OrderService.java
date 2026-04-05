package order;

import java.util.List;

public interface OrderService {
    List<OrderVO> getOrderListByUser(Long userId);
}


