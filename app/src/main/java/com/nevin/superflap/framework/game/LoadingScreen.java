package com.nevin.superflap.framework.game;

/**
 * Created by nevin on 9/15/2017.
 */

import com.nevin.superflap.framework.Game;
import com.nevin.superflap.framework.Graphics;
import com.nevin.superflap.framework.Graphics.ImageFormat;
import com.nevin.superflap.framework.Screen;

public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.menu = g.newImage("menu.png", ImageFormat.RGB565);
        Assets.background = g.newImage("background.png", ImageFormat.RGB565);
        Assets.character = g.newImage("Skier_Sprite1.png", ImageFormat.ARGB4444);
        Assets.border_top = g.newImage("border.png", ImageFormat.RGB565);
        Assets.blue_gate = g.newImage("bl_gate.png", ImageFormat.RGB565);
        Assets.red_gate = g.newImage("red_gate.png", ImageFormat.RGB565);
        Assets.fin_line = g.newImage("fin_line.png", ImageFormat.RGB565);
        //This is how you would load a sound if you had one.
        //Assets.click = game.getAudio().createSound("explode.ogg");
        game.setScreen(new MainMenuScreen(game));
    }
    @Override
    public void paint(float deltaTime) {
        Graphics g = game.getGraphics();
        g.drawImage(Assets.splash, 0, 0);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {

    }


}
