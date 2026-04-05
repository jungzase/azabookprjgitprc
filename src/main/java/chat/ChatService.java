package chat;

import java.util.List;

public interface ChatService {
    List<ChatVO> getChatList(String userId);
    List<ChatVO> getChatRoom(String senderId, String receiverId);
    boolean sendMessage(ChatVO chat);
    boolean readMessage(Long chatId);
    boolean removeMessage(Long chatId);
}