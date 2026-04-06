package chat;

import java.util.List;

public interface ChatDAO {
    List<ChatVO> selectChatList(String userId);
    List<ChatVO> selectChatRoom(String senderId, String receiverId);
    int insertMessage(ChatVO chat);
    int updateReadStatus(Long chatId);
    int deleteMessage(Long chatId);
}