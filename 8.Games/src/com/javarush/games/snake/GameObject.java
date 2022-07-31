package com.javarush.games.snake;/*Main method*/

public class GameObject {
    public boolean isAlive;
    public int x = 0;
    public int y = 0;

    GameObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }
}
