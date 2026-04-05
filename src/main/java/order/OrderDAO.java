package order;

import java.util.List;

public interface OrderDAO {
    Long insertOrder(OrderVO order);
    List<OrderVO> findByUserId(Long userId);
    List<OrderItemVO> findItemsByOrderId(Long orderId);
    
}

