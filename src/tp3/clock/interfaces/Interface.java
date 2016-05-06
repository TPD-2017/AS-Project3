package tp3.clock.interfaces;


import tp3.clock.Clock;

/***
 * Class Interface and its subclasses follow the Observer design pattern
 * They derive their state from Clock, serving only as a presentation layer
 */
public abstract class Interface {

    private Clock clock;

    public Interface(Clock clock){
        this.clock = clock;
    }

    public abstract void showTime();
}
