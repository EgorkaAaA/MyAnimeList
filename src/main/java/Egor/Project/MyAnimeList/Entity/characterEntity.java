package Egor.Project.MyAnimeList.Entity;

import javax.persistence.*;

@Entity
public class characterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String characterName;

    @ManyToOne
    private voiceActorEntity voiceActor;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public voiceActorEntity getVoiceActor() {
        return voiceActor;
    }

    public void setVoiceActor(voiceActorEntity voiceActor) {
        this.voiceActor = voiceActor;
    }

    public characterEntity() {
    }
}
