package cart;

import java.util.List;

public interface CartDAO {
    List<CartVO> findByUserId(Long userId);
    boolean clear(Long userId);
}

