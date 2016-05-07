package tp3;


import tp3.clock.Clock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Clock c = new Clock();
        Thread t = new Thread(c);
        t.start();
    }
}
