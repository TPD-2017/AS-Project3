package tp3.clock.warnings.timeOut;

import tp3.clock.Clock;
import tp3.clock.warnings.Warning;


public abstract class WarningTimeOut extends Warning {

    private int timeLeft;

    public WarningTimeOut(Clock clock) {
        super(clock);
    }
}
