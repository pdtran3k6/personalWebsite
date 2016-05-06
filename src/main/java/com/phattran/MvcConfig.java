package com.phattran;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	registry.addViewController("/").setViewName("aboutme");
    	registry.addViewController("/aboutme").setViewName("aboutme");
        registry.addViewController("/projects-legoSaltSpreader").setViewName("projects-legoSaltSpreader");
        registry.addViewController("/projects-listMatching").setViewName("projects-listMatching");
        registry.addViewController("/projects-smartBatteryCharger").setViewName("projects-smartBatteryCharger");
        registry.addViewController("/projects").setViewName("projects");
    
    }
}