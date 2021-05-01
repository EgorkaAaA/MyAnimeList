//package Egor.Project.MyAnimeList.securingweb;
//
//import Egor.Project.MyAnimeList.Services.userDetailsService;
//import Egor.Project.MyAnimeList.Services.userService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    private final userDetailsService userDetailsService;
//
//    public WebSecurityConfig(userDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/", "/home").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
////        http
////                .antMatcher("/**")
////                .authorizeRequests()
////                .antMatchers("/", "/home", "/registration").permitAll()
////                .anyRequest().authenticated()
////                .and()
////                .formLogin()
////                .loginPage("/login")
////                .permitAll()
////                .loginProcessingUrl("/login").permitAll().usernameParameter("userName").passwordParameter("password")
////                .defaultSuccessUrl("/profile")
////                .and()
////                .logout()
////                .permitAll()
////                .and()
////                .rememberMe()
////                .alwaysRemember(true)
////                .tokenValiditySeconds(3600)
////                .rememberMeCookieName("mouni")
////                .key("somesecret");
//    }
//
//
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService)
//                .passwordEncoder(NoOpPasswordEncoder.getInstance());
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/css/**","/fonts/**","/libs/**");
//    }
//}