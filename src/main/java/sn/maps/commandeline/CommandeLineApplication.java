package sn.maps.commandeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandeLineApplication {

    public static void main(String[] args) {

        SpringApplication.run(CommandeLineApplication.class, args);
        System.out.println("Hello World");
    }

}
