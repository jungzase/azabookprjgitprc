package chat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatVO {
    private Long chatId;
    private String senderId;
    private String receiverId;
    private String message;
    private String sendTime;
    private String readYn;
}