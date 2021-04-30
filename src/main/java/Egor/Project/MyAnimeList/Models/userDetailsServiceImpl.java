package Egor.Project.MyAnimeList.Models;

import Egor.Project.MyAnimeList.Entity.userEntity;
import Egor.Project.MyAnimeList.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class userDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private userRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        userEntity user = userRepo.findByUserName(userName)
                .orElseThrow(() -> new UsernameNotFoundException("Пользователь не найден"));
        return userModel.build(user);
    }
}
