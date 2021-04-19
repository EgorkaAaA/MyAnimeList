package Egor.Project.MyAnimeList.Controllers;

import Egor.Project.MyAnimeList.Services.animeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    private final animeService animeService;

    public homeController(animeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping("/")
    public String home(Model model){
        animeService.startValue();
        model.addAttribute("anime", animeService.findAllAnime());
        model.addAttribute("Title", "Аниме");
        return "home";
    }
}
