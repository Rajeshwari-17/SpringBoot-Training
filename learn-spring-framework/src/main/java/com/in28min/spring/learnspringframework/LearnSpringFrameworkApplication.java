package com.in28min.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28min.spring.learnspringframework.game.GameRunner;
import com.in28min.spring.learnspringframework.game.MarioGame;
import com.in28min.spring.learnspringframework.game.PackmanGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//MarioGame game = new MarioGame();
		PackmanGame game = new PackmanGame();
		//SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
		
	}

}
