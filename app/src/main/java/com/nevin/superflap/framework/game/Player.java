package com.nevin.superflap.framework.game;

/**
 * Created by nevin on 9/21/2017.
 */
import java.util.ArrayList;
import android.graphics.Rect;

public class Player {
    final int MOVESPEED = 20;
    private int speedY = 0;
    private int speedX = 5;
    private int centerX = 200;
    private int centerY = 200;
    private boolean movingUp = false;
    public boolean movingDown = false;
    public static Rect rect = new Rect(0, 0, 0, 0);
    private Background bg1 = GameScreen.getBg1();
    private Background bg2 = GameScreen.getBg2();
    public boolean isDead = false;
    private int score = 0;
    public void update(){
        score +=1;
        if (movingUp == true){
            if(speedY < MOVESPEED){
                speedY+=1;
            }

        }

        if (movingDown == true){
            if(speedY > (MOVESPEED*-1)){
                speedY-=1;
            }

        }
        centerY += (speedY/2);
        speedX = MOVESPEED - Math.abs(speedY);
        bg1.setSpeedX(-speedX/8);//scroll accordingly
        bg2.setSpeedX(-speedX/8);
        rect.set(centerX - 34, centerY - 63, centerX + 34, centerY);//set bounding box for player
    }

    public void setMovingUp(boolean movUp){
        if(movUp == false){
            movingUp = false;
        }else{
            movingUp = true;
        }
    }

    public void setMovingDown(boolean movDown){
        if(movDown == false){
            movingDown = false;
        }else{
            movingDown = true;
        }
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }
}
