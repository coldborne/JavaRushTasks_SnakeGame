package com.javarush.games.snake;/*Main method*/

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;

    public void initialize(){
        setScreenSize(WIDTH, HEIGHT);
    }
}
