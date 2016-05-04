package tp3.interfaces;


import tp3.Clock;

public abstract class Interface {

    private Clock clock;

    public Interface(Clock clock){
        this.clock = clock;
    }

    public abstract void showTime();
}
