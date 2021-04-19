package Egor.Project.MyAnimeList.Services;

import Egor.Project.MyAnimeList.Entity.animeListEntity;
import Egor.Project.MyAnimeList.Exception.animeAlreadyAdded;
import Egor.Project.MyAnimeList.Repository.animeListRepo;
import Egor.Project.MyAnimeList.Repository.animeRepo;
import Egor.Project.MyAnimeList.Repository.userRepo;
import org.springframework.stereotype.Service;

@Service
public class animeListService {
    private final animeListRepo animeListRepo;
    private final animeRepo animeRepo;
    private final userRepo userRepo;

    public animeListService(animeListRepo animeListRepo, animeRepo animeRepo, userRepo userRepo) {
        this.animeListRepo = animeListRepo;
        this.animeRepo = animeRepo;
        this.userRepo = userRepo;
    }

    public void addAnimeToList(long userId, long animeId) throws animeAlreadyAdded {
        animeListEntity animeListEntity = new animeListEntity();

        if(animeListRepo.findByAnimeAndUser(animeRepo.findById(animeId),userRepo.findById(userId)) == null) {
            animeListEntity.setAnime(animeRepo.findById(animeId));
            animeListEntity.setUser(userRepo.findById(userId));
            animeListRepo.save(animeListEntity);
        }
        else {
            throw new animeAlreadyAdded("Аниме уже добавленно!");
        }
    }
}
