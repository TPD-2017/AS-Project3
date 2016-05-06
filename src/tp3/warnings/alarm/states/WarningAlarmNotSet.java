package tp3.warnings.alarm.states;

import tp3.Clock;
import tp3.warnings.WarningState;
import tp3.warnings.alarm.WarningAlarm;

/**
 * Integração de Sistemas
 * Pedro Filipe Dinis Stamm de Matos, 2009116927
 */
public class WarningAlarmNotSet extends WarningState {

    @Override
    public void createWarning(int hour, int minutes, int seconds) {

    }

    @Override
    public void adjustWarning(int hour, int minutes, int seconds) {

    }

    @Override
    public void changeWarning() {

    }

    @Override
    public void cancelWarning() {

    }

    @Override
    public void tryRing() {

    }

    @Override
    protected void ring() {

    }
}
