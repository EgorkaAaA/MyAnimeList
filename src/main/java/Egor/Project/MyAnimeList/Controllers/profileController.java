package Egor.Project.MyAnimeList.Controllers;

import Egor.Project.MyAnimeList.Entity.animeListEntity;
import Egor.Project.MyAnimeList.Entity.userEntity;
import Egor.Project.MyAnimeList.Services.animeListService;
import Egor.Project.MyAnimeList.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.List;

@Controller
public class profileController {
    private final userService userService;
    private final animeListService animeListService;

    public profileController(userService userService, animeListService animeListService) {
        this.userService = userService;
        this.animeListService = animeListService;
    }

    @GetMapping("/profile")
    public String profile(Model model, Principal principal) {
        userEntity user = userService.findUserByName(principal.getName());
        model.addAttribute("Title", "Профиль");
        model.addAttribute("user", user);
        List<animeListEntity> animeList = animeListService.getAnimeList(user);
        model.addAttribute("anime", animeListService.getAnimeList(user));
        return "profile";
    }
}
