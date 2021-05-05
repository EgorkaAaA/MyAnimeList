package Egor.Project.MyAnimeList.Repository;

import Egor.Project.MyAnimeList.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface roleRepo extends JpaRepository<Role, Long> {
}
