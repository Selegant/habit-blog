package com.selegant.habitblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringCloudApplication
public class HabitBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(HabitBlogApplication.class, args);
	}
}
