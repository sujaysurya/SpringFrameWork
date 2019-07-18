package com.codegeek.springframework.javaconfig.masterPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.codegeek.springframework.javaconfig.helperPackage.FortuneService;
import com.codegeek.springframework.javaconfig.helperPackage.SadFortuneService;
import com.codegeek.springframework.javaconfig.mainBeanPackage.Coach;
import com.codegeek.springframework.javaconfig.mainBeanPackage.SwimCoach;

@Configuration
@ComponentScan("com.codegeek.springframework.javaconfig")

@PropertySource("classpath:sport.properties")
public class SportStarConfig {

	// define a bean for sadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean for swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	

}
