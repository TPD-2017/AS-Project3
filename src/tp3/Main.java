package tp3;


import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Clock c = new Clock();
        c.setHour(15);
        c.setMinutes(30);
        c.setSeconds(0);
        //c.setCur_interface(c.getAnalog());
        c.getDigital().showTime();
        sleep(5000);
        c.setCur_interface(c.getAnalog());
        c.getCur_interface().showTime();
    }
}
