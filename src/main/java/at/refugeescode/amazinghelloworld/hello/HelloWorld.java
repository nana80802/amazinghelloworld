package at.refugeescode.amazinghelloworld.hello;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private Hello hello;
    private World world;

    public HelloWorld(Hello hello, World world) {
        this.hello = hello;
        this.world = world;
    }

    public String sayHelloWorld(){
        String hello = this.hello.SayHello();
        String world = this.world.sayWorld();

        return hello + " " + world;
    }
}
