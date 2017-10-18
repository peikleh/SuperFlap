package com.nevin.superflap.framework.game;

/**
 * Created by nevin on 9/21/2017.
 */

import android.graphics.Rect;
import com.nevin.superflap.framework.Image;

public class Tile {

    private int tileX, tileY, speedX;
    public int type;
    public Image tileImage;

    private Player Player = GameScreen.getPlayer();
    private Background bg = GameScreen.getBg1();

    private Rect r;

    public Tile(int x, int y, int typeInt) {
        tileX = x * 40;
        tileY = y * 40;
        type = typeInt;
        r = new Rect();

        if (type == 1) {
            tileImage = Assets.blue_gate;
        } else if (type == 2) {
            tileImage = Assets.red_gate;
        } else if (type == 3) {
            tileImage = Assets.fin_line;

        } else if (type == 4) {
            tileImage = Assets.border_top;
        } else {
            type = 0;
        }

    }

    public void update() {
        speedX = bg.getSpeedX() * 5;
        tileX += speedX;
        r.set(tileX, tileY, tileX+40, tileY+40);

        if (Rect.intersects(r, Player.rect) && type != 0 && type !=3) {
            Player.isDead = true;
        }
    }

    public int getTileX() {
        return tileX;
    }

    public void setTileX(int tileX) {
        this.tileX = tileX;
    }

    public int getTileY() {
        return tileY;
    }

    public void setTileY(int tileY) {
        this.tileY = tileY;
    }

    public Image getTileImage() {
        return tileImage;
    }

    public void setTileImage(Image tileImage) {
        this.tileImage = tileImage;
    }



}