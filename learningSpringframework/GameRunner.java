package com.in28min.spring.learnspringframework.game;

import com.in28min.spring.learnspringframework.GamingConsole;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
