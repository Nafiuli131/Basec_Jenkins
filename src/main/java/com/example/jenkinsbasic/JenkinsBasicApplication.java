package com.example.jenkinsbasic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsBasicApplication {
	public static Logger logger = LoggerFactory.getLogger(JenkinsBasicApplication.class);

	public void intt(){
		logger.info("before the application started");
	}
	public static void main(String[] args) {
		logger.info("spring boot application is executing.....");
		SpringApplication.run(JenkinsBasicApplication.class, args);
	}

}
