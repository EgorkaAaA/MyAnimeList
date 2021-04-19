package Egor.Project.MyAnimeList.Controllers;

import Egor.Project.MyAnimeList.Services.animeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/anime")
public class animeController {
    private final animeService animeService;

    public animeController(animeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping("/{id}")
    public String anime(Model model, @PathVariable long id) {
        model.addAttribute("anime",animeService.findAnimeById(id));
        return "anime";
    }
}
