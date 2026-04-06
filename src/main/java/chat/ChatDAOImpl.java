package chat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ChatDAOImpl implements ChatDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ChatVO> selectChatList(String userId) {
        return null;
    }

    @Override
    public List<ChatVO> selectChatRoom(String senderId, String receiverId) {
        return null;
    }

    @Override
    public int insertMessage(ChatVO chat) {
        return 0;
    }

    @Override
    public int updateReadStatus(Long chatId) {
        return 0;
    }

    @Override
    public int deleteMessage(Long chatId) {
        return 0;
    }
}