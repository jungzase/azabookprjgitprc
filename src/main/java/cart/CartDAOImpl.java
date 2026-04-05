package cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAOImpl implements CartDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    

    @Override
    public List<CartVO> findByUserId(Long userId) {
        String sql = "SELECT c.cart_id, c.user_id, c.isbn, c.quantity, b.book_name, b.price, b.stock " +
                     "FROM cart c JOIN books b ON c.isbn=b.isbn WHERE c.user_id=? ORDER BY c.cart_id DESC";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            CartVO vo = new CartVO();
            vo.setCartId(rs.getLong("cart_id"));
            vo.setUserId(rs.getLong("user_id"));
            vo.setIsbn(rs.getString("isbn"));
            vo.setQuantity(rs.getInt("quantity"));
            vo.setBookName(rs.getString("book_name"));
            vo.setPrice(rs.getInt("price"));
            vo.setStock(rs.getInt("stock"));
            return vo;
        }, userId);
    }

    

    @Override
    public boolean clear(Long userId) {
        String sql = "DELETE FROM cart WHERE user_id=?";
        return jdbcTemplate.update(sql, userId) > 1 ? true : false;
    }
}

