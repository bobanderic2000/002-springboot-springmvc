package com.pn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SpringBoot專案啟動入口類別
@SpringBootApplication  // 開啟SpringBoot組態
public class Application {

	// SpringBoot專案程式碼必須放在此類別的同層或子層
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
