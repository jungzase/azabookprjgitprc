package order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import book.BookDAO;
import book.BookVO;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;
    
    @Autowired
    private BookDAO bookDAO;

    

    

    @Override
    public List<OrderVO> getOrderListByUser(Long userId) {
        List<OrderVO> list = orderDAO.findByUserId(userId);
        for (OrderVO vo : list) {
            vo.setItems(orderDAO.findItemsByOrderId(vo.getOrderId()));
        }
        return list;
    }

    

    
}


