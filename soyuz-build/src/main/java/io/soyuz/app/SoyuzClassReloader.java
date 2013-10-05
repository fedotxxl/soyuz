/*
 * SoyuzClassReloader
 * Copyright (c) 2012 Cybervision. All rights reserved.
 */
package io.soyuz.app;

import com.springsource.loaded.ReloadEventProcessorPlugin;

public class SoyuzClassReloader implements ReloadEventProcessorPlugin {

    @Override
    public boolean shouldRerunStaticInitializer(String s, Class<?> aClass, String s2) {
        return false;
    }

    @Override
    public void reloadEvent(String s, Class<?> aClass, String s2) {
        System.out.println("s: " + s + "; " + aClass + "; " + s2);
    }
}
