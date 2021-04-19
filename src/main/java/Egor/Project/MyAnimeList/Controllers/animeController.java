package Egor.Project.MyAnimeList.Controllers;

import Egor.Project.MyAnimeList.Entity.animeEntity;
import Egor.Project.MyAnimeList.Entity.userEntity;
import Egor.Project.MyAnimeList.Services.animeListService;
import Egor.Project.MyAnimeList.Services.animeService;
import Egor.Project.MyAnimeList.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anime")
public class animeController {
    private final userService userService;
    private final animeService animeService;
    private final animeListService animeListService;

    public animeController(animeService animeService, userService userService, animeListService animeListService) {
        this.animeService = animeService;
        this.userService = userService;
        this.animeListService = animeListService;
    }

    @PostMapping("/{id}")
    public void animeAdd(@PathVariable long id) {
        animeListService.addAnimeToList(1,id);
    }

    @GetMapping("/{id}")
    public String anime(Model model, @PathVariable long id) {
        userService.createUsers();
        animeListService.addAnimeToList(1,id);
        model.addAttribute("anime",animeService.findAnimeById(id));
        return "anime";
    }
}
