package in.india.config;
import in.india.security.AppSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AppSecurity createInstance() {
        AppSecurity appSecurity = new AppSecurity("AES");
        System.out.println("AppSecurity createInstance method called...");
        return appSecurity;
    }
    
}
