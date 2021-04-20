package Egor.Project.MyAnimeList.Repository;

import Egor.Project.MyAnimeList.Entity.ERole;
import Egor.Project.MyAnimeList.Entity.roleEntity;
import Egor.Project.MyAnimeList.Entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepo extends JpaRepository<userEntity,Long> {
    userEntity findById(long id);

    Optional<roleEntity> findByUserName(ERole name);

}
