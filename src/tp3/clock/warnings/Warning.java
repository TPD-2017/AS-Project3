package tp3.clock.warnings;

import tp3.clock.Clock;


/***
 * Warning and its subclasses follow the State design pattern, making it so
 * the Clock can try to raise the alarm without fully knowing its state
 * or how it functions internally.
 */
public abstract class Warning {
    private Clock clock;

    private int hour=0;
    private int minute=0;
    private int second=0;

    private WarningState state;
    private WarningState set;
    private WarningState notSet;

    public Warning(Clock clock){
        this.clock=clock;
    }

    public Clock getClock() {
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

    public WarningState getSet() {
        return set;
    }

    public void setSet(WarningState set) {
        this.set = set;
    }

    public WarningState getNotSet() {
        return notSet;
    }

    public void setNotSet(WarningState notSet) {
        this.notSet = notSet;
    }
}
