package github.juniorexz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
/* Sem necessidade por padrão @ComponentScan(basePackages =
        {"github.juniorexz.repository",
         "github.juniorexz.service",
         "com.umaoutrabiblioteca.projeto"})*/
@RestController//Manda mensagens através desta classe
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;


    @GetMapping("/hello")
    public String helloWorld() {
        return "applicationName";
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

}
