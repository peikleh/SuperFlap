package com.nevin.superflap.framework.implementation;

/**
 * Created by nevin on 8/31/2017.
 */

import android.view.View.OnTouchListener;

import com.nevin.superflap.framework.Input.TouchEvent;

import java.util.List;

public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<TouchEvent> getTouchEvents();
}