package com.learn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/*

 * @SpringBootApplication is a convenience annotation that adds all of the following:

 *  a) @Configuration tags the class as a source of
 *     bean definitions for the application context.

 *  b) @EnableAutoConfiguration tells Spring Boot to start adding
 *     beans based on classpath settings, other beans, and various property settings.

 *  c) Normally you would add @EnableWebMvc for a Spring MVC app,
 *     but Spring Boot adds it automatically when it sees spring-webmvc on the classpath.
 *     This flags the application as a web application and activates key behaviors such
 *     as setting up a DispatcherServlet.

 *  d) @ComponentScan tells Spring to look for other components,
 *     configurations, and services in the hello package,
 *     allowing it to find the controllers.
 *
 *
 *
 * @EnableScheduling ensures that a background task executor is created. Without it, nothing gets scheduled.
 * [ Uncomment it below to enable scheduling - we have disabled it to not populate logs ]
 */


/*
https://www.mkyong.com/spring-boot/spring-boot-deploy-war-file-to-tomcat/
 Added extends SpringBootServletInitializer and configure method via above blog

Why ???
Before adding them - my war was not able to get executed on uploading to Elastic bean stalk
*/

//http://spring-web-demo.us-east-1.elasticbeanstalk.com/

@SpringBootApplication
// @EnableScheduling
public class SpringInitializerApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringInitializerApplication.class);
    }


	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringInitializerApplication.class, args);
	}
}