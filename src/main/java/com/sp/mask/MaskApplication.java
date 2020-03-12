package com.sp.mask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class MaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaskApplication.class, args);
	}

}
