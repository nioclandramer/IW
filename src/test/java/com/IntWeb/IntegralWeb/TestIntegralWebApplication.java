package com.IntWeb.IntegralWeb;

import org.springframework.boot.SpringApplication;

public class TestIntegralWebApplication {

	public static void main(String[] args) {
		SpringApplication.from(IntegralWebApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
