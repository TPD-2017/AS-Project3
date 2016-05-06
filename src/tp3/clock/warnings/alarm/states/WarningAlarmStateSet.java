package tp3.clock.warnings.alarm.states;

import tp3.clock.warnings.WarningState;

/**
 * Created by pedro on 5/6/16.
 */
public class WarningAlarmStateSet extends WarningState {
    @Override
    public void createWarning(int hour, int minutes, int seconds) {
        System.out.println(">>Alarm already created.");
    }

    @Override
    public void adjustWarning(int hour, int minutes, int seconds) {
        this.getWarning().setHour(hour);
        this.getWarning().setMinute(minutes);
        this.getWarning().setSecond(seconds);
    }

    @Override
    public void cancelWarning() {

    }

    @Override
    public void tryRing() {

    }
}
