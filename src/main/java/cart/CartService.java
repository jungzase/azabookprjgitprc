package cart;

import java.util.List;

public interface CartService {
    List<CartVO> getCartList(Long userId);
}

