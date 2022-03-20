package com.example;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.context.request.RequestContextListener;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@EntityScan("Entities")
@ComponentScan("Controllers")
@ComponentScan("secure")
//@EnableAutoConfiguration
@EnableJpaRepositories("Repository")
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class BasicApplication extends SpringBootServletInitializer{
    
//    @Bean
// public RequestContextListener requestContextListener() {
//         return new RequestContextListener();
// }

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}
        
}
