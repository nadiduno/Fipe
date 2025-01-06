package br.com.fipe.Fipe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fipe.Fipe.principal.Principal;


@SpringBootApplication
public class FipeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FipeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.showMenu();
    }
}