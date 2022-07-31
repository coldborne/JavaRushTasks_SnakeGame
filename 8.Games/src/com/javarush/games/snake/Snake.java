package com.javarush.games.snake;/*Main method*/

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake extends GameObject{

    private static final String HEAD_SIGN = "H";
    private static final String BODY_SIGN = "B";
    //List для хранения координат ячеек змейки
    private List<GameObject> snakeParts = new ArrayList<>();

    Snake(int x, int y) {
        super(x, y);

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

    public void draw(Game game){
        game.setCellValue(snakeParts.get(0).x, snakeParts.get(0).y, HEAD_SIGN);
        game.setCellValue(snakeParts.get(1).x, snakeParts.get(1).y, BODY_SIGN);
        game.setCellValue(snakeParts.get(2).x, snakeParts.get(2).y, BODY_SIGN);
    }
}
