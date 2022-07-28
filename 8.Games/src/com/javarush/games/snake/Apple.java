package com.javarush.games.snake;/*Main method*/

import com.javarush.engine.cell.*;


public class Apple extends GameObject{

    private final String APPLE_SIGN = "X";
    Apple(int x, int y) {
        super(x, y);
    }

    public void draw(Game game){
        game.setCellValueEx(SnakeGame.WIDTH/2,SnakeGame.HEIGHT/2,Color.RED,APPLE_SIGN);
    }
}
