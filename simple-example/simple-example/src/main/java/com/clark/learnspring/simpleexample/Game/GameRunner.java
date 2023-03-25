package com.clark.learnspring.simpleexample.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game=game;
    }
    public void run() {
        this.game.up();
        this.game.down();
        this.game.right();
        this.game.left();
    }
}
