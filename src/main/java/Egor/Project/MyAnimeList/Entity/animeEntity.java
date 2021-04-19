package Egor.Project.MyAnimeList.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class animeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String animeName;

    private byte animeRating;

    private int animeViews;

    @ManyToOne
    private studioEntity studio;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public byte getAnimeRating() {
        return animeRating;
    }

    public void setAnimeRating(byte animeRating) {
        this.animeRating = animeRating;
    }

    public int getAnimeViews() {
        return animeViews;
    }

    public void setAnimeViews(int animeViews) {
        this.animeViews = animeViews;
    }

    public studioEntity getStudio() {
        return studio;
    }

    public void setStudio(studioEntity studio) {
        this.studio = studio;
    }

    public animeEntity() {
    }
}
