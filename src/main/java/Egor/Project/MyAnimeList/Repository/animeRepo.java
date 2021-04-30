package Egor.Project.MyAnimeList.Repository;

import Egor.Project.MyAnimeList.Entity.animeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface animeRepo extends CrudRepository<animeEntity, Long> {
    animeEntity findById(long id);
}
