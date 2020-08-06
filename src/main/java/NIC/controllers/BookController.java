package NIC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BookController {

    @GetMapping("/book")
    public String home(Model model) {
        return "book";
    }
}
