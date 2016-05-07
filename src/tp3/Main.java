package tp3;


import tp3.clock.Clock;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Clock c = new Clock();
        c.getAlarm().getState().createWarning(17, 40, 00);
        Thread t = new Thread(c);
        t.start();
    }
}
