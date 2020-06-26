package com.INC.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.INC.demo.Service.OpenCsvService;

@SpringBootApplication
public class OpencsvApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OpencsvApplication.class, args);
	}

	@Autowired
	private OpenCsvService ops;
	
	@Override
	public void run(String... args) throws Exception {
		
		ops.saveCsv();
		
	}

}
