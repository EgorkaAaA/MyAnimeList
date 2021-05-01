package Egor.Project.MyAnimeList.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class adminController {
    @GetMapping
    public String adminPanel(Model model) {
        model.addAttribute("Title", "Admin Panel");
        return "admin/admin";
    }

    @GetMapping
    public String animePanel(Model model) {
        model.addAttribute("Title", "Anime Panel");
        return "admin/admin";
    }
}