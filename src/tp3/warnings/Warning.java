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
    private Clock clock;

    private int hour=0;
    private int minutes=0;
    private int seconds=0;
    private boolean set=false;

    public Warning(Clock clock){
        this.clock=clock;
    }

    public abstract void createWarning(int hour, int minutes, int seconds);

    public abstract void adjustWarning(int hour, int minutes, int seconds);

    public abstract void cancelWarning();

    public abstract void tryRing();

    public abstract void ring();

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public boolean isSet() {
        return set;
    }

    public void setSet(boolean set) {
        this.set = set;
    }
}
