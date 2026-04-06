package chat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatDAO chatDAO;

    @Override
    public List<ChatVO> getChatList(String userId) {
        return null;
    }

    @Override
    public List<ChatVO> getChatRoom(String senderId, String receiverId) {
        return null;
    }

    @Override
    public boolean sendMessage(ChatVO chat) {
        return false;
    }

    @Override
    public boolean readMessage(Long chatId) {
        return false;
    }

    @Override
    public boolean removeMessage(Long chatId) {
        return false;
    }
}