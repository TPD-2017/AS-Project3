package tp3.clock.warnings.timeOut.states;

import tp3.clock.warnings.Warning;
import tp3.clock.warnings.WarningState;

import java.util.Calendar;

/**
 * Created by pedro on 5/7/16.
 */
public class WarningTimeOutStateSet extends WarningState {

    public WarningTimeOutStateSet(Warning warning) {
        super(warning);
    }

    @Override
    public void createWarning(int hour, int minutes, int seconds) {
        System.out.println(">>TimeOut already created.");
    }

    @Override
    public void adjustWarning(int hour, int minutes, int seconds) {
        double timeLeft = this.getWarning().getTimeLeft();
        timeLeft = timeLeft + hour*3600 + minutes*60 + seconds;
        this.getWarning().setTimeLeft(timeLeft);
    }

    @Override
    public void cancelWarning() {
        this.getWarning().setState(this.getWarning().getNotSet());
    }

    @Override
    public void tryRing() {
        double timeLeft = this.getWarning().getTimeLeft();
        timeLeft--;
        this.getWarning().setTimeLeft(timeLeft);
        if(timeLeft == 0){
            this.getWarning().getClock().getState().ring();
            this.getWarning().setState(this.getWarning().getNotSet());
        }
    }
}
