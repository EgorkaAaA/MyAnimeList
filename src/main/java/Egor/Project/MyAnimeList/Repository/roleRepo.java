package Egor.Project.MyAnimeList.Repository;

import Egor.Project.MyAnimeList.Entity.ERole;
import Egor.Project.MyAnimeList.Entity.roleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface roleRepo extends JpaRepository<roleEntity, Long> {
    Optional<roleEntity> findByName(ERole name);
}
