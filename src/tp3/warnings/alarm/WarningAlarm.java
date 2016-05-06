package tp3.warnings.alarm;

import tp3.Clock;
import tp3.warnings.Warning;

/**
 * Created by pedro on 5/4/16.
 */
public abstract class WarningAlarm extends Warning {

    private int hour;
    private int minute;
    private int second;

    private WarningAlarm state;

    public WarningAlarm(Clock clock, int hour, int  minute, int second) {
        super(clock);
    }
}
