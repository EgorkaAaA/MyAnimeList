package Egor.Project.MyAnimeList.Controllers;

import Egor.Project.MyAnimeList.Services.characterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/character")
public class characterController {
    private final characterService characterService;

    public characterController(characterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/{id}")
    public String characterShow(@PathVariable long id, Model model) {

        model.addAttribute("character", characterService.findCharacterById(id));
        model.addAttribute("Title", characterService.findCharacterById(id).getCharacterName());
        return "character";
    }
}
