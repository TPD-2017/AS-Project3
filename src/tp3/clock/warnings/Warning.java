package tp3.clock.warnings;

import tp3.clock.Clock;

/**
 * Created by pedro on 5/4/16.
 */

/***
 * Warning and its subclasses follow the State design pattern, making it so
 * the Clock can try to raise the alarm without fully knowing its state
 * or how it functions internally.
 */
public abstract class Warning {
    protected Clock clock;

    private int hour=0;
    private int minute=0;
    private int second=0;

    private WarningState state;

    public Warning(Clock clock){
        this.clock=clock;
    }

    protected Clock getClock() {
        return clock;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public WarningState getState() {
        return state;
    }

    public void setState(WarningState state) {
        this.state = state;
    }
}
