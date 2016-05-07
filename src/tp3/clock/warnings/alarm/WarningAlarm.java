package tp3.clock.warnings.alarm;

import tp3.clock.Clock;
import tp3.clock.warnings.Warning;
import tp3.clock.warnings.alarm.states.WarningAlarmStateNotSet;
import tp3.clock.warnings.alarm.states.WarningAlarmStateSet;

/**
 * Created by pedro on 5/4/16.
 */
public abstract class WarningAlarm extends Warning {

    private WarningAlarmStateNotSet notSet = new WarningAlarmStateNotSet();
    private WarningAlarmStateSet set = new WarningAlarmStateSet();

    public WarningAlarm(Clock clock) {
        super(clock);
        this.setSet(new WarningAlarmStateSet());
        this.setNotSet(new WarningAlarmStateNotSet());
        this.setState(this.notSet);
    }
}
