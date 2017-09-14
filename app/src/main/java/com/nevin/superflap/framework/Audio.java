package com.nevin.superflap.framework;

/**
 * Created by nevin on 8/31/2017.
 */

public interface Audio {
    public Music createMusic(String file);

    public Sound createSound(String file);
}