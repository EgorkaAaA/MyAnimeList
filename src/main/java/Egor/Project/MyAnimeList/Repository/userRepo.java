package Egor.Project.MyAnimeList.Repository;

import Egor.Project.MyAnimeList.Entity.userEntity;
import org.springframework.data.repository.CrudRepository;

public interface userRepo extends CrudRepository<userEntity,Long> {
    userEntity findById(long id);
}
