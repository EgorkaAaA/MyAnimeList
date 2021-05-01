//package Egor.Project.MyAnimeList.Services;
//
//import Egor.Project.MyAnimeList.Repository.userRepo;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class userDetailsService implements UserDetailsService {
//    private final userRepo userRepo;
//
//    public userDetailsService(Egor.Project.MyAnimeList.Repository.userRepo userRepo) {
//        this.userRepo = userRepo;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        return userRepo.findByUsername(s);
//    }
//}
