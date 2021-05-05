package Egor.Project.MyAnimeList.Services;

import Egor.Project.MyAnimeList.Entity.animeEntity;
import Egor.Project.MyAnimeList.Repository.animeRepo;
import org.springframework.stereotype.Service;

@Service
public class animeService {
    private final animeRepo animeRepo;

    public animeService(animeRepo animeRepo) {
        this.animeRepo = animeRepo;
    }

    public void startValue(){
        if(animeRepo.count() == 0)
        {
            for(int i = 0; i <= 100; i++)
            {
                animeEntity anime = new animeEntity();
                anime.setAnimeName("NewAnime" + i);
                anime.setAnimeRating((byte)i);
                anime.setAnimeViews(0);
                animeRepo.save(anime);
            }
        }
    }

    public Iterable<animeEntity> findAllAnime () {
        return animeRepo.findAll();
    }

    public animeEntity findAnimeById (long id) {
        return animeRepo.findById(id);
    }
}
