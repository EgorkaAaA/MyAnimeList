//package Egor.Project.MyAnimeList.securingweb;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .antMatcher("/**")
//                .authorizeRequests()
//                .antMatchers("/", "/home", "/registration").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .loginProcessingUrl("/login").permitAll().usernameParameter("username").passwordParameter("password")
//                .defaultSuccessUrl("/home")
//                .and()
//                .logout()
//                .permitAll()
//                .and()
//                .rememberMe()
//                .alwaysRemember(true)
//                .tokenValiditySeconds(3600)
//                .rememberMeCookieName("mouni")
//                .key("somesecret");
//    }
//
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("u")
//                        .password("p")
//                        .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
//}
