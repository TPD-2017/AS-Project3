package tp3.clock.warnings.timeOut.states;

import tp3.clock.warnings.Warning;
import tp3.clock.warnings.WarningState;

import java.util.Calendar;

/**
 * Created by pedro on 5/7/16.
 */
public class WarningTimeOutStateNotSet extends WarningState {
    public WarningTimeOutStateNotSet(Warning warning) {
        super(warning);
    }

    @Override
    public void createWarning(int hour, int minutes, int seconds) {
        this.getWarning().setTimeLeft(hour*3600+minutes*60+seconds);
        this.getWarning().setState(this.getWarning().getSet());
    }

    @Override
    public void adjustWarning(int hour, int minutes, int seconds) {
        System.out.println(">>TimeOut not created yet.");
    }

    @Override
    public void cancelWarning() {
        System.out.println(">>TimeOut not created yet.");
    }

    @Override
    public void tryRing() {
        System.out.println(">>TimeOut not created yet.");
    }
}
