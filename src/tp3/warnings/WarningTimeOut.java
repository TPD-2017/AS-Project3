package tp3.warnings;

import tp3.Clock;

/**
 * Created by pedro on 5/4/16.
 */
public class WarningTimeOut extends Warning {
    public WarningTimeOut(Clock clock) {
        super(clock);
    }

    @Override
    public void createWarning(int hour, int minutes, int seconds) {

    }

    @Override
    public void adjustWarning(int hour, int minutes, int seconds) {

    }

    @Override
    public void cancelWarning() {

    }

    @Override
    public void tryRing() {

    }

    @Override
    public void ring() {

    }
}
