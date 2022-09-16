package edu.utp.service.movie.controller;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    //No tienen que pasar obligatoriamente por el controlador
    @Override
    public void addViewControllers(ViewControllerRegistry registro){
        registro.addViewController("/").setViewName("index");
        registro.addViewController("/api/usuario/login");
        registro.addViewController("/errors/Template403").setViewName("/errors/Template403");
    }
}
