package kogut.token.JWT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class TokenApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TokenApplication.class, args);
    }

}
