package com.nevin.superflap.framework;

/**
 * Created by nevin on 8/31/2017.
 */

import com.nevin.superflap.framework.Graphics.ImageFormat;

public interface Image {
    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
