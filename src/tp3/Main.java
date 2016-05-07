package tp3;


import tp3.clock.Clock;

import java.util.Calendar;
import java.util.Date;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Clock c = new Clock();
        Thread t = new Thread(c);
        t.start();
    }
}
