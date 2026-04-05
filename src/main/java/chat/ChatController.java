package chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @RequestMapping("/list")
    public String chatList(Model model) {
        return "chat/list";
    }

    @RequestMapping("/room")
    public String chatRoom(String senderId, String receiverId, Model model) {
        return "chat/room";
    }

    @RequestMapping("/send")
    public String sendMessage(ChatVO chat) {
        return "redirect:/chat/room";
    }

    @RequestMapping("/read")
    public String readMessage(Long chatId) {
        return "redirect:/chat/list";
    }

    @RequestMapping("/delete")
    public String deleteMessage(Long chatId) {
        return "redirect:/chat/list";
    }
}