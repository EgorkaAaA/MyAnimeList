package Egor.Project.MyAnimeList.pojo;

import Egor.Project.MyAnimeList.Entity.roleEntity;

import java.util.List;
import java.util.Set;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String userName;
    private List<roleEntity> roles;

    public JwtResponse(String token, Long id, String userName, List<roleEntity> roles) {
        this.token = token;
        this.id = id;
        this.userName = userName;
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<roleEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<roleEntity> roles) {
        this.roles = roles;
    }
}
