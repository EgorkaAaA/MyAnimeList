package Egor.Project.MyAnimeList.Repository;

import Egor.Project.MyAnimeList.Entity.animeEntity;
import org.springframework.data.repository.CrudRepository;

public interface animeRepo extends CrudRepository<animeEntity, Long> {
    animeEntity findById(long id);
}
