package com.example.apollo.test;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableApolloConfig
public class ApolloTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApolloTestApplication.class, args);
	}

	@GetMapping("/hi")
	public String hi() {
		return "hi, devops";
	}
	@Value("${hello:hello}")
	private String hello;
	@RequestMapping ("/hello")
	public String hello() {
		return hello;
	}
	@Value("${test:默认值}")
	private String test;
	@GetMapping("/test")
	public String test(){
		return "test的值为: " + test;
	}
}
