package tp3.clock;

/**
 * Created by pedro on 5/6/16.
 */
public abstract class ClockState {

    private Clock clock;

    public ClockState(Clock clock){
        this.clock=clock;
    }

    public Clock getClock() {
        return clock;
    }

    public abstract void adjustTime(int second, int minute, int hour, int day, int month, int year);

    public abstract void start();

    public abstract void stop();

    public abstract void tick();

}
