package tp3.clock.warnings.alarm.states;

import tp3.clock.warnings.Warning;
import tp3.clock.warnings.WarningState;

import java.util.Calendar;


public class WarningAlarmStateSet extends WarningState {
    public WarningAlarmStateSet(Warning warning) {
        super(warning);
    }

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
        this.getWarning().setState(this.getWarning().getNotSet());
    }

    @Override
    public void tryRing() {
        Calendar c = this.getWarning().getClock().getCal();
        if((c.get(Calendar.HOUR_OF_DAY) == this.getWarning().getHour()) &&
                (c.get(Calendar.MINUTE) == this.getWarning().getMinute()) &&
                (c.get(Calendar.SECOND) == this.getWarning().getSecond())
                ){
            this.getWarning().getClock().getState().ring();
        }
    }
}
