package com.clark.learnspring.simpleexample.Game;

import org.springframework.stereotype.Component;

@Component
public class GTA implements GamingConsole{
    public void up(){
        System.out.println("GTA jump");
    }
    public void down(){
        System.out.println("GTA down");
    }
    public void right(){
        System.out.println("GTA accelerate");
    }
    public void left(){
        System.out.println("GTA stop");
    }
}
