package example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TaskConfig {
    @Bean
    @Primary
    public Dog dog1() {
        return new Dog("Rosa");
    }

    @Bean
    public Dog dog2() {
        return new Dog("Sharik");
    }

}
