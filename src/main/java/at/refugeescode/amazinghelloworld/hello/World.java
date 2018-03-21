package at.refugeescode.amazinghelloworld.hello;

import org.springframework.stereotype.Component;

@Component
public class World {
    public String sayWorld(){
        return "World";
    }
}
