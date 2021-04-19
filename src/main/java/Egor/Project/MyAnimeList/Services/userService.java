package Egor.Project.MyAnimeList.Services;

import Egor.Project.MyAnimeList.Entity.userEntity;
import Egor.Project.MyAnimeList.Repository.userRepo;
import org.springframework.stereotype.Service;

@Service
public class userService {
    private final userRepo userRepo;

    public userService(userRepo userRepo) {
        this.userRepo = userRepo;
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

    public userEntity findUserById (long id){
        return userRepo.findById(id);
    }
}
