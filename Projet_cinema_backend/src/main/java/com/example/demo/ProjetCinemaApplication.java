package com.example.demo;

import com.example.demo.entities.Film;
import com.example.demo.sid.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ProjetCinemaApplication implements CommandLineRunner {

    @Autowired
    private ICinemaInitService initService;
    @Autowired
    private RepositoryRestConfiguration restConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ProjetCinemaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Film.class);
        initService.initVilles();
        initService.initCinemas();
        initService.initSalles();
        initService.initPlaces();
        initService.initSeances();
        initService.initGategories();
        initService.initFilms();
        initService.initProjections();
        initService.initTickets();
    }
}
