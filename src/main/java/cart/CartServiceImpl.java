package cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDAO cartDAO;


    @Override
    public List<CartVO> getCartList(Long userId) {
        return cartDAO.findByUserId(userId);
    }

}

