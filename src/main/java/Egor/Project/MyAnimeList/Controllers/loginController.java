package Egor.Project.MyAnimeList.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class loginController {
    @GetMapping()
    public String loginPage(Model model) {
        model.addAttribute("Title", "Login");
        return "login";
    }

}
