package Egor.Project.MyAnimeList.Repository;

import Egor.Project.MyAnimeList.Entity.animeListEntity;
import org.springframework.data.repository.CrudRepository;

public interface animeListRepo extends CrudRepository<animeListEntity, Long> {
}
