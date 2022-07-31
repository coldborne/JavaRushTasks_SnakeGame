package com.javarush.games.snake;/*Main method*/

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;

    private int turnDelay;

    @Override
    public void initialize(){
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void drawScene(){
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellValueEx(x, y, Color.AQUA, "");
            }
        }
        snake.draw(this);
    }

    private void createGame(){
        int firstXOfSnake = WIDTH / 2;
        int yOfSnake = HEIGHT / 2;
        snake = new Snake(firstXOfSnake,yOfSnake);
        drawScene();
        turnDelay = 300;
        setTurnTimer(turnDelay);
//        int firstXOfSnake = (int) (Math.random()*12+1);
//        int yOfSnake = (int) (Math.random()*12+1);

//        Apple apple = new Apple(7,7);
//        apple.draw(this);
    }

    @Override
    public void onTurn(int a) {
        snake.move();
        drawScene();
    }

    @Override
    public void onKeyPress(Key key) {
        switch (key){
            case LEFT:
                if(snake.getDirection() == Direction.RIGHT){} else {
                    snake.setDirection(Direction.LEFT);
                }
                break;
            case RIGHT:
                if(snake.getDirection() == Direction.LEFT){} else {
                    snake.setDirection(Direction.RIGHT);
                }
                break;
            case DOWN:
                if(snake.getDirection() == Direction.UP){} else {
                    snake.setDirection(Direction.DOWN);
                }
                break;
            case UP:
                if(snake.getDirection() == Direction.DOWN){} else {
                    snake.setDirection(Direction.UP);
                }
                break;
        }
    }
}
