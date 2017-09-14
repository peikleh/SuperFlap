package com.nevin.superflap.framework.implementation;

/**
 * Created by nevin on 8/31/2017.
 */

import android.graphics.Bitmap;

import com.nevin.superflap.framework.Graphics.ImageFormat;
import com.nevin.superflap.framework.Image;

public class AndroidImage implements Image {
    Bitmap bitmap;
    ImageFormat format;

    public AndroidImage(Bitmap bitmap, ImageFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public ImageFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }
}

