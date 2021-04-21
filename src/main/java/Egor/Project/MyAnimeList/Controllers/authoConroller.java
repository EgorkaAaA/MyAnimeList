package Egor.Project.MyAnimeList.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class authoConroller {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
