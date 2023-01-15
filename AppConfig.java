package com.training.springmvc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.training.springmvc")

public class AppConfig {
	
	@Bean
	public InternalResourceViewResolver resolve() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource driver = new DriverManagerDataSource();
		driver.setUrl("jdbc:mysql://localhost:3306/infinite");
		driver.setUsername("root");
		driver.setPassword("root@123");
		driver.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return driver;
		
	}
	
	

}