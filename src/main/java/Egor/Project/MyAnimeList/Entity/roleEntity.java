package Egor.Project.MyAnimeList.Entity;

import javax.persistence.*;

@Entity
public class roleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Enumerated(EnumType.STRING)
    private ERole name;

    public roleEntity() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }
}
