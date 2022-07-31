package com.javarush.games.snake;/*Main method*/

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake extends GameObject{


    private Direction direction = Direction.LEFT;

    private static final String HEAD_SIGN = "H";

    private static final String BODY_SIGN = "B";

    //List для хранения координат ячеек змейки
    private List<GameObject> snakeParts = new ArrayList<>();

    Snake(int x, int y) {
        super(x, y);

        isAlive = true;

        //Задаём стартовые координаты змейки
        GameObject firstElementOfSnake = new GameObject(x,y);
        GameObject secondElementOfSnake = new GameObject(x+1,y);
        GameObject thirdElementOfSnake = new GameObject(x+2,y);

        //Добавляем их в List snakeParts
        snakeParts.add(firstElementOfSnake);
        snakeParts.add(secondElementOfSnake);
        snakeParts.add(thirdElementOfSnake);
    }

    public List<GameObject> getSnakeParts() {
        return snakeParts;
    }

    public void setSnakeParts(List<GameObject> snakeParts) {
        this.snakeParts = snakeParts;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void draw(Game game){

        if (isAlive){
            for (int i = 0; i < snakeParts.size(); i++) {
                if(i==0){
                    game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, Color.ORANGE, 75);
                } else {
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.ORANGE, 75);
                }
            }
        } else {
            for (int i = 0; i < snakeParts.size(); i++) {
                if(i==0){
                    game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, Color.RED, 75);
                } else {
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.RED, 75);
                }
            }
        }
    }
}
