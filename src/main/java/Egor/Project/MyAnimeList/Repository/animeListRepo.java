package Egor.Project.MyAnimeList.Repository;

import Egor.Project.MyAnimeList.Entity.animeEntity;
import Egor.Project.MyAnimeList.Entity.animeListEntity;
import Egor.Project.MyAnimeList.Entity.userEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface animeListRepo extends CrudRepository<animeListEntity, Long> {
    animeListEntity findByAnimeAndUser(animeEntity anime, userEntity user);
    List<animeListEntity> findAllByUser(userEntity user);
}
