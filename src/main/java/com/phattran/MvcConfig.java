package com.phattran;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/aboutme").setViewName("aboutme");
        registry.addViewController("/projects").setViewName("projects");
        registry.addViewController("/articles").setViewName("articles");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        
        // Articles linkage
        registry.addViewController("/articles/how-to-get-better-at-StarCraft").setViewName("/articles/how-to-get-better-at-StarCraft");
    }

}