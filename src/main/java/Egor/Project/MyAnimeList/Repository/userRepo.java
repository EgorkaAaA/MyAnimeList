package Egor.Project.MyAnimeList.Repository;

import Egor.Project.MyAnimeList.Entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepo extends JpaRepository<userEntity,Long> {
    userEntity findById(long id);

    userEntity findByUserName(String name);
}
