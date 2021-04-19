package Egor.Project.MyAnimeList.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class studioEntity {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String studioName;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public studioEntity() {
    }
}
