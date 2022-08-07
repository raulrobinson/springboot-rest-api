package com.rasysbox.apiblog;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.convert.Jsr310Converters;

import com.rasysbox.apiblog.security.JwtAuthenticationFilter;

@SpringBootApplication
@EntityScan(basePackageClasses = { 
	ApiblogApplication.class,
	Jsr310Converters.class
})
public class ApiblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiblogApplication.class, args);
	}

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	/* @Bean
	public JwtAuthenticationFilter jwtAuthenticationFilter() {
		return new JwtAuthenticationFilter();
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	} */

}
