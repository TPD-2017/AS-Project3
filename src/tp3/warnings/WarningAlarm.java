package tp3.warnings;

import tp3.Clock;

/**
 * Created by pedro on 5/4/16.
 */
public class WarningAlarm extends Warning {
    public WarningAlarm(Clock clock) {
        super(clock);
    }

    @Override
    public void createWarning(int hour, int minutes, int seconds) {
        if(this.isDone()) {
            this.setHour(hour);
            this.setMinutes(minutes);
            this.setSeconds(seconds);
            this.setDone(false);
        } else {
            System.out.println(">>Error: Alarm already created.");
        }
    }

    @Override
    public void adjustWarning(int hour, int minutes, int seconds) {
        if(!this.isDone()){
            this.setHour(hour);
            this.setMinutes(minutes);
            this.setSeconds(seconds);
        } else {
            System.out.println(">>Error: Alarm not created yet.");
        }
    }

    @Override
    public void cancelWarning() {
        if(!this.isDone()){
            this.setHour(0);
            this.setMinutes(0);
            this.setSeconds(0);
            this.setDone(true);
        } else {
            System.out.println(">>Error: Alarm not created yet.");
        }
    }

    @Override
    public void tryRing() {

    }

    @Override
    public void ring() {

    }
}
