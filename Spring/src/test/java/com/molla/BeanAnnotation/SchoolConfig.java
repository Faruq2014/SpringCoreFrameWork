package com.molla.BeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolConfig {
	@Bean // creating Bean for Principal class.
	public Principal princupalBean() {
		return new Principal();
	}
	
//Constructor Injection
	/*
	 * @Bean(name = { "pilot School", "High School" }) // naming your Bean, able to have multipole name
	 * 
	 *  public School schoolBean() { // default Bean id =schoolBean 
	 * School school = new School(); 
	 * return school;
	 * // or 
	 * return new School(princupalBean()); }
	 */
	
	//Setter Injection
	@Bean(name = { "pilot School", "High School" }) // naming your Bean, able to have multipole name
	public School schoolBean() { // default Bean id = schoolBean
		School school = new School();
		school.setPrincipal(princupalBean());
		return school;
	
		
	}
}
