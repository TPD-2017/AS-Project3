package tp3.warnings;

import tp3.Clock;

/**
 * Created by pedro on 5/4/16.
 */
public abstract class Warning {
    private Clock clock;

    private int hour=0;
    private int minutes=0;
    private int seconds=0;
    private boolean done=true;

    public Warning(Clock clock){
        this.clock=clock;
    }

    public abstract void createWarning();

    public abstract void adjustWarning();

    public abstract void cancelWarning();

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
}
