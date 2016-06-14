package com.uptake;

public class Functions {
    public static void sleep(int seconds) {
        sleep(1.0 * seconds);
    }

    public static void sleep(double secs) {
        long millis = (long) (secs * 1000);

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
