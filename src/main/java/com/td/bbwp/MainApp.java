package com.td.bbwp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.lightadmin.core.util.LightAdminConfigurationUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// @EnableAutoConfiguration
// @EntityScan("com.td.bbwp")
public class MainApp extends SpringBootServletInitializer{

    // @Autowired
	// private AppUserRepository repository;
	
	/*
	@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        .configure(servletContext)
                .basePackage("org.lightadmin.boot.administration")
                .baseUrl("/admin")
                .security(false)
                .backToSiteUrl("http://lightadmin.org");
 
        super.onStartup(servletContext);
    }*/
 

	// @Override
	public void run(String... args) throws Exception {
		// System.err.println(this.repository.findAll());
	}

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}

	@Bean
	SpringDataRestEventHandler groupEventHandler() {
		return new SpringDataRestEventHandler(null);
	}
}
