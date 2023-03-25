package com.clark.learnspring.simpleexample;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.clark.learnspring.simpleexample.Game.GameRunner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		GameRunner runner=context.getBean(GameRunner.class);
		runner.run();
	}

}
