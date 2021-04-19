package Egor.Project.MyAnimeList.Entity;

import javax.persistence.*;

@Entity
public class animeListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long row;

    @ManyToOne
    private userEntity user;

    public Long getRow() {
        return row;
    }

    public void setRow(Long row) {
        this.row = row;
    }

    public userEntity getUser() {
        return user;
    }

    public void setUser(userEntity user) {
        this.user = user;
    }

    public animeEntity getAnime() {
        return anime;
    }

    public void setAnime(animeEntity anime) {
        this.anime = anime;
    }

    public animeListEntity() {
    }

    @ManyToOne
    private animeEntity anime;
}
