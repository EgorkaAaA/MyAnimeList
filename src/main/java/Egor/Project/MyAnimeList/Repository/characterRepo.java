package Egor.Project.MyAnimeList.Repository;

import Egor.Project.MyAnimeList.Entity.characterEntity;
import org.springframework.data.repository.CrudRepository;

public interface characterRepo extends CrudRepository<characterEntity, Long> {
    characterEntity findById(long id);
}
