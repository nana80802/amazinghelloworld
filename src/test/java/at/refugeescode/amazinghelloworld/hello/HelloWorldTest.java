package at.refugeescode.amazinghelloworld.hello;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloWorldTest {
    @Autowired
    private HelloWorld helloWorld;

    @Test
    void sayHelloWorld() {
        String result = this.helloWorld.sayHelloWorld();
        assertAll(
                () -> assertEquals("Hello World", result)
        );
    }
}