package tp3.warnings.timeOut;

import tp3.Clock;
import tp3.warnings.Warning;

/**
 * Created by pedro on 5/4/16.
 */
public abstract class WarningTimeOut extends Warning {

    private int timeLeft;

    public WarningTimeOut(Clock clock) {
        super(clock);
    }
}
