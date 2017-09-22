package com.nevin.superflap.framework.game;

/**
 * Created by nevin on 9/21/2017.
 */
import java.util.ArrayList;
import android.graphics.Rect;

public class Player {
    final int MOVESPEED = 5;
    private int speedY = -5;
    private int centerX = 100;
    private int centerY = 200;
    private boolean MovingUp = false;
    public static Rect rect = new Rect(0, 0, 0, 0);
    private Background bg1 = GameScreen.getBg1();
    private Background bg2 = GameScreen.getBg2();
    public boolean isDead = false;
    public void update(){
        bg1.setSpeedX(-MOVESPEED / 5);//scroll accordingly
        bg2.setSpeedX(-MOVESPEED / 5);
        if (MovingUp == false){
            centerY += speedY;
        }else{
            centerY -= speedY;
        }
        rect.set(centerX - 34, centerY - 63, centerX + 34, centerY);//set bounding box for player

    }

    public void setMovingUp(boolean movUp){
        if(movUp == false){
            MovingUp = false;
        }else{
            MovingUp = true;
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
}
