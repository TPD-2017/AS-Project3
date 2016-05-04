package tp3;


public abstract class Interface {

    private Clock clock;

    public Interface(Clock clock){
        this.clock = clock;
    }

    public abstract void showTime();

    public abstract void adjustTime();

    public abstract void createAlarm();

    public abstract void cancelAlarm();

    public abstract void createTimeOut();

    public abstract void cancelTimeOut();

    public abstract void ring();

    public abstract void tick();
}
