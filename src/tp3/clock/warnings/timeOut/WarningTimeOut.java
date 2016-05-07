package tp3.clock.warnings.timeOut;

import tp3.clock.Clock;
import tp3.clock.warnings.Warning;
import tp3.clock.warnings.alarm.states.WarningAlarmStateNotSet;
import tp3.clock.warnings.alarm.states.WarningAlarmStateSet;
import tp3.clock.warnings.timeOut.states.WarningTimeOutStateNotSet;
import tp3.clock.warnings.timeOut.states.WarningTimeOutStateSet;


public class WarningTimeOut extends Warning {

    public WarningTimeOut(Clock clock) {
        super(clock);
        this.setSet(new WarningTimeOutStateSet(this));
        this.setNotSet(new WarningTimeOutStateNotSet(this));
        this.setState(this.getNotSet());
    }
}
