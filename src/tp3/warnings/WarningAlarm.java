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
        if(!this.isSet()) {
            this.setHour(hour);
            this.setMinutes(minutes);
            this.setSeconds(seconds);
            this.setSet(false);
        } else {
            System.out.println(">>Error: Alarm already set.");
        }
    }

    @Override
    public void adjustWarning(int hour, int minutes, int seconds) {
        if(this.isSet()){
            this.setHour(hour);
            this.setMinutes(minutes);
            this.setSeconds(seconds);
        } else {
            System.out.println(">>Error: Alarm not set.");
        }
    }

    @Override
    public void changeWarning() {
        if(this.isSet()){
            this.setSet(false);
            this.setHour(0);
            this.setMinutes(0);
            this.setSeconds(0);
        }
        this.clock.setCur_warning(this.clock.getTimeOut());
    }

    @Override
    public void cancelWarning() {
        if(this.isSet()){
            this.setHour(0);
            this.setMinutes(0);
            this.setSeconds(0);
            this.setSet(true);
        } else {
            System.out.println(">>Error: Alarm not set.");
        }
    }

    @Override
    public void tryRing() {
        if(this.isSet()){
            if(this.getClock().getHour() == this.getHour()
                    && this.getClock().getMinutes() == this.getMinutes()
                    && this.getClock().getSeconds() == this.getSeconds()){
                this.ring();
            }
        } else {
            System.out.println(">>Error: Alarm not set.");
        }
    }

    @Override
    protected void ring() {
        this.setSet(false);
        System.out.println(">>Alarm is ringing.");
        this.setHour(0);
        this.setMinutes(0);
        this.setSeconds(0);
    }
}
