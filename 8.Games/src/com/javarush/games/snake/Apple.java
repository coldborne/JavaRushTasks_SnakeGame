package com.javarush.games.snake;/*Main method*/

import com.javarush.engine.cell.*;


public class Apple extends GameObject{

    private static final String APPLE_SIGN = "X";
    Apple(int x, int y) {
        super(x, y);
    }

    public void draw(Game game){
        game.setCellValueEx(x,y,Color.NONE,APPLE_SIGN,Color.RED,75);
    }
}
