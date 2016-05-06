package tp3.clock.warnings.alarm.states;

import tp3.clock.warnings.WarningState;

/**
 * Pedro Filipe Dinis Stamm de Matos, 2009116927
 */
public class WarningAlarmStateNotSet extends WarningState {

    @Override
    public void createWarning(int hour, int minutes, int seconds) {
        this.getWarning().setHour(hour);
        this.getWarning().setMinute(minutes);
        this.getWarning().setSecond(seconds);
        //this.getWarning().setState(this.getWarning().get)
    }

    @Override
    public void adjustWarning(int hour, int minutes, int seconds) {
        System.out.println(">>Alarm not created yet.");
    }

    @Override
    public void cancelWarning() {
        System.out.println(">>Alarm not created yet.");
    }

    @Override
    public void tryRing() {
        System.out.println(">>Alarm not created yet.");
    }
}
