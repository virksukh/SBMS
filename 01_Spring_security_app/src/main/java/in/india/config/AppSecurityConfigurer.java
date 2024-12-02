package in.india.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfigurer {

    @Bean
    public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests( (req) -> {
            req.requestMatchers("/welcome")
                    .permitAll()
                    .anyRequest()
                    .authenticated();
        } ).formLogin(Customizer.withDefaults());
        return http.build();
    }
}
