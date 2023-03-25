package com.clark.learnspring.simpleexample.Game;

public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("down");
    }
    public void right(){
        System.out.println("accelerate");
    }
    public void left(){
        System.out.println("stop");
    }
}
