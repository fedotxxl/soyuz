/*
 * Start
 * Copyright (c) 2012 Cybervision. All rights reserved.
 */
package io.soyuz.app;

public class Start {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello space!");

        while (true) {
            System.out.println("Still working");
            Thread.sleep(10*1000);
        }

    }

}
