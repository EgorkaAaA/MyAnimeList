package Egor.Project.MyAnimeList.Services;

import Egor.Project.MyAnimeList.Entity.animeEntity;
import Egor.Project.MyAnimeList.Entity.animeListEntity;
import Egor.Project.MyAnimeList.Entity.userEntity;
import Egor.Project.MyAnimeList.Exception.animeAlreadyAdded;
import Egor.Project.MyAnimeList.Repository.animeListRepo;
import Egor.Project.MyAnimeList.Repository.animeRepo;
import Egor.Project.MyAnimeList.Repository.userRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class animeListService {
    private final animeListRepo animeListRepo;
    private final animeRepo animeRepo;

    public animeListService(animeListRepo animeListRepo, animeRepo animeRepo, userRepo userRepo) {
        this.animeListRepo = animeListRepo;
        this.animeRepo = animeRepo;
    }

    public void addAnimeToList(userEntity user, long animeId) throws animeAlreadyAdded {
        animeListEntity animeListEntity = new animeListEntity();

        if(animeListRepo.findByAnimeAndUser(animeRepo.findById(animeId),user) == null) {
            animeListEntity.setAnime(animeRepo.findById(animeId));
            animeListEntity.setUser(user);
            animeListRepo.save(animeListEntity);
        }

        else {
            throw new animeAlreadyAdded("Аниме уже добавлено!");
        }
    }

    public List<animeListEntity> getAnimeList(userEntity user){
        return animeListRepo.findAllByUser(user);
    }
}
