package com.javarush.games.snake;/*Main method*/

import java.util.ArrayList;
import java.util.List;

public class Snake extends GameObject{

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
}
