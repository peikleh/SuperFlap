package com.nevin.superflap.framework.game;

/**
 * Created by nevin on 9/15/2017.
 */
import com.nevin.superflap.framework.Game;
import com.nevin.superflap.framework.Graphics;
import com.nevin.superflap.framework.Screen;
import com.nevin.superflap.framework.Graphics.ImageFormat;
public class SplashLoadingScreen extends Screen {
    public SplashLoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.splash= g.newImage("splash.jpg", ImageFormat.RGB565);


        game.setScreen(new LoadingScreen(game));

    }

    @Override
    public void paint(float deltaTime) {

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
