package Egor.Project.MyAnimeList.Services;

import Egor.Project.MyAnimeList.Entity.userEntity;
import Egor.Project.MyAnimeList.Exception.notGoodUserName;
import Egor.Project.MyAnimeList.Exception.userAlreadyExist;
import Egor.Project.MyAnimeList.Repository.userRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class userService {

    private final userRepo userRepo;

    public userService(userRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Boolean aUser(userEntity user){
        return userRepo.findByUserName(user.getUserName()) != null &&
                userRepo.findByUserName(user.getUserName()).getPassword().equals(user.getPassword());
    }

    public void createUsers() {
        if(userRepo.count() == 0) {
            for (int i = 0; i < 6; i++) {
                userEntity user = new userEntity();
                user.setUserName("user " + i);
                user.setPassword("123");
                userRepo.save(user);
            }
        }
    }

    public void createUser(userEntity user) throws userAlreadyExist, notGoodUserName {
        if(userRepo.findByUserName(user.getUserName()) == null && goodUserName(user.getUserName())){
            userRepo.save(user);
        }
        else throw new userAlreadyExist("Пользователь уже существует");
    }

    private boolean goodUserName(String userName) throws notGoodUserName {
        Pattern p = Pattern.compile("...."); //Да 4 точки и что? я считаю что это хорошая проверка
        Matcher m = p.matcher(userName);

        String result = "";
        while(m.find()) {
            result += m.group(0);
        }

        if(result.equals("")) {
            throw new notGoodUserName("Имя пользователя короче 4 букв");
        }
        return true;
    }

    public userEntity findUserById (long id){
        return userRepo.findById(id);
    }

}
