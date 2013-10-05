/*
 * StartWithReloading
 * Copyright (c) 2012 Cybervision. All rights reserved.
 */
package io.soyuz.app;

import com.springsource.loaded.agent.SpringLoadedPreProcessor;

public class StartWithReloading {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello reloadable space!");

        SpringLoadedPreProcessor.registerGlobalPlugin(new SoyuzClassReloader());

        while (true) {
            System.out.println("Still working");
            Thread.sleep(10*1000);
        }

    }

}
