package Egor.Project.MyAnimeList.Models;

import Egor.Project.MyAnimeList.Entity.userEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class userModel implements UserDetails {
    private long id;

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    private String userName;
    @JsonIgnore
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public userModel(long id, String name, String password, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.userName = name;
        this.password = password;
        this.authorities = authorities;
    }

    public static userModel build(userEntity user) {
        List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName().name()))
                .collect(Collectors.toList());

        return new userModel(
                user.getId(),
                user.getUserName(),
                user.getPassword(),
                authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
