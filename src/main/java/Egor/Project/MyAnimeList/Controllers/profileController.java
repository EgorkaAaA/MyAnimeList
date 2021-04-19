package Egor.Project.MyAnimeList.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class profileController {
    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("Title", "Профиль");
        return "profile";
    }
}
