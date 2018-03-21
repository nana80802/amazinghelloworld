package at.refugeescode.amazinghelloworld.starter;

import at.refugeescode.amazinghelloworld.hello.HelloWorld;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfugration {

    @Bean
    public ApplicationRunner startAmazingHelloWorld(HelloWorld helloWorld){
        return args -> {
            String text = helloWorld.sayHelloWorld();
            System.out.println(text);
        };

    }
}
