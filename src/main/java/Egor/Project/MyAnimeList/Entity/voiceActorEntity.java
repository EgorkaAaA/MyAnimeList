package Egor.Project.MyAnimeList.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class voiceActorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    public String voiceActorName;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getVoiceActorName() {
        return voiceActorName;
    }

    public void setVoiceActorName(String voiceActorName) {
        this.voiceActorName = voiceActorName;
    }

    public voiceActorEntity() {
    }
}
