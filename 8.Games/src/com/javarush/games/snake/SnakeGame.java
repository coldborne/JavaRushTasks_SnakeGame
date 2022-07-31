package com.javarush.games.snake;/*Main method*/

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;

    @Override
    public void initialize(){
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void drawScene(){
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellColor(x, y, Color.AQUA);
            }
        }
    }

    private void createGame(){
        drawScene();
        int firstXOfSnake = (int) (Math.random()*12+1);
        int yOfSnake = (int) (Math.random()*12+1);
        Snake snake = new Snake(firstXOfSnake,yOfSnake);
//        Apple apple = new Apple(7,7);
//        apple.draw(this);
    }
}
