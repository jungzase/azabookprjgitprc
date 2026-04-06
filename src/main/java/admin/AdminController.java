package admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import book.BookService;
import book.BookVO;
import chat.ChatService;
import member.MemberService;

@Controller
public class AdminController {

    @Autowired
    private BookService bookService;
    @Autowired
    private MemberService memberService;

    @Autowired
    private OrderService orderService;
    @Autowired
    private ChatService chatService;

    


    @GetMapping("/admin/books")
    public String books(Model model) {
        model.addAttribute("bookList", bookService.getAllBooksAdmin());
        return "admin/bookList";
    }

    @GetMapping("/admin/book/form")
    public String bookForm(String isbn, Model model) {
        if (isbn != null && !isbn.isEmpty()) {
            model.addAttribute("book", bookService.getBook(isbn));
        }
        return "admin/bookForm";
    }

    @PostMapping("/admin/book/save")
    public String save(BookVO vo) {
        if (bookService.getBook(vo.getIsbn()) == null) {
            bookService.insert(vo);
        } else {
            bookService.update(vo);
        }
        return "redirect:/admin/books";
    }

    @PostMapping("/admin/book/delete")
    public String delete(String isbn) {
        bookService.delete(isbn);
        return "redirect:/admin/books";
    }

    @GetMapping("/admin/members")
    public String members(Model model) {
        model.addAttribute("memberList", memberService.getAllMembers());
        return "admin/memberList";
    }


    @GetMapping("/admin/chat")
    public String chaters(Model model) {
        model.addAttribute("chatList", chatService.getChatList(null));
        return "admin/chatList";
    }


    
}

