package micro.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Welcome
{

    @RequestMapping("/{name}")
    String welcome(@PathVariable String name) {
        return String.format("Welcome, %s!", name);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Welcome.class, args);
    }

}
