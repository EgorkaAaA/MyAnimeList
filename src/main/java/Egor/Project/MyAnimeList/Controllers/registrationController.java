package Egor.Project.MyAnimeList.Controllers;

import Egor.Project.MyAnimeList.Entity.userEntity;
import Egor.Project.MyAnimeList.Exception.notGoodUserName;
import Egor.Project.MyAnimeList.Exception.userAlreadyExist;
import Egor.Project.MyAnimeList.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class registrationController {
    @Autowired
    private userService userService;
    @GetMapping
    public String registrationPage(Model model ){
        model.addAttribute("Title", "Registration");
        return "registration";
    }
    @PostMapping
    public String reg(@ModelAttribute("user") @Valid userEntity user){
        try {
            userService.createUser(user);
        } catch (Egor.Project.MyAnimeList.Exception.userAlreadyExist | notGoodUserName userAlreadyExist) {
            userAlreadyExist.printStackTrace();
        }
        return "redirect:/login";
    }
}
