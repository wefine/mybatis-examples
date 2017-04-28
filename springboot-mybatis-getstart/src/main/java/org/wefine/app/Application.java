package org.wefine.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wefine.app.mapper.CityMapper;

@SpringBootApplication
public class Application implements CommandLineRunner {

    final private CityMapper cityMapper;

    public Application(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.cityMapper.findByState("CA"));
    }
}
