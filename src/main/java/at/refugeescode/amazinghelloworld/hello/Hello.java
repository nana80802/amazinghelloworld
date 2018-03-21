package at.refugeescode.amazinghelloworld.hello;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    public String SayHello() {
        return "Hello";
    }
}
