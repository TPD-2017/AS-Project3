package tp3.clock.warnings.alarm;

import tp3.clock.Clock;
import tp3.clock.warnings.Warning;
import tp3.clock.warnings.alarm.states.WarningAlarmStateNotSet;
import tp3.clock.warnings.alarm.states.WarningAlarmStateSet;


public class WarningAlarm extends Warning {

    public WarningAlarm(Clock clock) {
        super(clock);
        this.setSet(new WarningAlarmStateSet(this));
        this.setNotSet(new WarningAlarmStateNotSet(this));
        this.setState(this.getNotSet());
    }
}
