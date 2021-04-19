package Egor.Project.MyAnimeList.Entity;

import javax.persistence.*;

@Entity
public class animeCharactersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long row;

    @ManyToOne
    private animeEntity anime;

    @ManyToOne
    private characterEntity character;
}
