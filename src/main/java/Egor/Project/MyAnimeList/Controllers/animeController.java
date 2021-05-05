package Egor.Project.MyAnimeList.Controllers;

import Egor.Project.MyAnimeList.Exception.animeAlreadyAdded;
import Egor.Project.MyAnimeList.Services.animeListService;
import Egor.Project.MyAnimeList.Services.animeService;
import Egor.Project.MyAnimeList.Services.userService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

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
    public String animeAdd(@PathVariable long id, Principal principal) {
        try {
            animeListService.addAnimeToList(userService.findUserByName(principal.getName()), id);
        } catch (animeAlreadyAdded animeAlreadyAdded) {
            animeAlreadyAdded.printStackTrace();
        }
        return "redirect:/anime/" + id;
    }

    @GetMapping("/{id}")
    public String anime(Model model, @PathVariable long id) {
        model.addAttribute("Title",animeService.findAnimeById(id).getAnimeName());
        model.addAttribute("anime",animeService.findAnimeById(id));
        return "anime";
    }
}
