package tp3.warnings;

import tp3.Clock;

/**
 * Created by pedro on 5/4/16.
 */

/***
 * Warning and its subclasses follow the State design pattern, making it so
 * the Clock can try to raise the alarm without fully knowing its state
 * or how it functions internally.
 *
 * A side effect of this design pattern is the impossibility of having both
 * and alarm and a timer set and running at the same time.
 */
public abstract class Warning {
    protected Clock clock;

    private int hour=0;
    private int minutes=0;
    private int seconds=0;
    private boolean set=false;

    public Warning(Clock clock){
        this.clock=clock;
    }

    public abstract void createWarning(int hour, int minutes, int seconds);

    public abstract void adjustWarning(int hour, int minutes, int seconds);

    public abstract void changeWarning();

    public abstract void cancelWarning();

    public abstract void tryRing();

    protected abstract void ring();

    protected int getHour() {
        return hour;
    }

    protected void setHour(int hour) {
        this.hour = hour;
    }

    protected int getMinutes() {
        return minutes;
    }

    protected void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    protected int getSeconds() {
        return seconds;
    }

    protected void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    protected boolean isSet() {
        return set;
    }

    protected void setSet(boolean set) {
        this.set = set;
    }

    protected Clock getClock() {
        return clock;
    }
}
