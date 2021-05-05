package Egor.Project.MyAnimeList.Services;

import Egor.Project.MyAnimeList.Entity.Role;
import Egor.Project.MyAnimeList.Entity.userEntity;
import Egor.Project.MyAnimeList.Repository.userRepo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class userDetailsService implements UserDetailsService {
    private final userRepo userRepo;

    public userDetailsService(Egor.Project.MyAnimeList.Repository.userRepo userRepo) {
        this.userRepo = userRepo;
    }

    public userEntity findByUserName(String userName) {
        return userRepo.findByUsername(userName);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        userEntity user = findByUserName(userName);
        if(user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new User(user.getUsername(), user.getPassword(),mapRolesToAuthority(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthority(Collection<Role> roles) {
        return roles.stream().map(r -> new SimpleGrantedAuthority(r.getName())).collect(Collectors.toList());
    }
}
