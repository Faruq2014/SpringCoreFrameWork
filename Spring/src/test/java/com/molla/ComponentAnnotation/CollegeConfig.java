	package com.molla.ComponentAnnotation;
	
	import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
	
	@Configuration
	@ComponentScan(basePackages = "com.molla.ComponentAnnotation")
	@PropertySource("classpath:College-Info.properties")
	public class CollegeConfig {
	
		public Teacher mathteacherBean() {
			// Teacher mathTeacher = new Mathteacher();
			// return mathTeacher;
			return new Mathteacher();
		}
	
		@Bean
		public College collegeBean() {
			College college = new College();
			college.setTeacher(mathteacherBean());
		return college;
	
		}
	}
