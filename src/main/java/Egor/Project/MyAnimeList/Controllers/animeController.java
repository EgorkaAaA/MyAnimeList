package Egor.Project.MyAnimeList.Controllers;

import Egor.Project.MyAnimeList.Exception.animeAlreadyAdded;
import Egor.Project.MyAnimeList.Services.animeListService;
import Egor.Project.MyAnimeList.Services.animeService;
import Egor.Project.MyAnimeList.Services.userService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/{id}")
    public String animeAdd(@PathVariable long id) {
        try {
            animeListService.addAnimeToList(1, id);
        } catch (animeAlreadyAdded animeAlreadyAdded) {
            animeAlreadyAdded.printStackTrace();
        }
        return "/home";
    }

    @GetMapping("/{id}")
    public String anime(Model model, @PathVariable long id) {
//        userService.createUsers();
        System.out.println("here");
        model.addAttribute("Title",animeService.findAnimeById(id).getAnimeName());
        model.addAttribute("anime",animeService.findAnimeById(id));
        return "anime";
    }
}
