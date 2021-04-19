package Egor.Project.MyAnimeList.Services;

import Egor.Project.MyAnimeList.Entity.characterEntity;
import Egor.Project.MyAnimeList.Repository.characterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class characterService {
    private final characterRepo characterRepo;

    public characterService(characterRepo characterRepo) {
        this.characterRepo = characterRepo;
    }

    public void createStartCharacters() {
        for(int i = 1; i < 6; i++) {
            characterEntity character = new characterEntity();
            character.setCharacterName("newCharacter " + i);
            characterRepo.save(character);
        }
    }

    public characterEntity findCharacterById(long id) {
        return characterRepo.findById(id);
    }
}
