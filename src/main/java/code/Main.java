package code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

    }
}