package com.manman.spring5tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class NpSpring5TutorialApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(NpSpring5TutorialApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(NpSpring5TutorialApplication.class, args);
    }
	
	/*protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(NpSpring5TutorialApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(NpSpring5TutorialApplication.class, args);
	}*/
}
