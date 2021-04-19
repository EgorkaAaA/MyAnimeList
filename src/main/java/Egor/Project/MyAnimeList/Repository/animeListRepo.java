package Egor.Project.MyAnimeList.Repository;

import Egor.Project.MyAnimeList.Entity.animeEntity;
import Egor.Project.MyAnimeList.Entity.animeListEntity;
import Egor.Project.MyAnimeList.Entity.userEntity;
import org.springframework.data.repository.CrudRepository;

public interface animeListRepo extends CrudRepository<animeListEntity, Long> {
    animeListEntity findByAnimeAndUser(animeEntity anime, userEntity user);
}