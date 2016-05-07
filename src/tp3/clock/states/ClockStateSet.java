package tp3.clock.states;

import tp3.clock.Clock;
import tp3.clock.ClockState;

import java.util.Calendar;


public class ClockStateSet extends ClockState {
    public ClockStateSet(Clock clock) {
        super(clock);
    }

    @Override
    public void adjustTime(int second, int minute, int hour, int day, int month, int year) {
        System.out.println(">>Must stop clock to adjust time.");
    }

    @Override
    public void start() {
        System.out.println(">>Clock is already running.");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
        this.getClock().setState(this.getClock().getStopped());
    }

    @Override
    public void tick() {
        this.getClock().getCal().add(Calendar.SECOND, 1);
        this.getClock().getAlarm().getState().tryRing();
        this.getClock().getTimeOut().getState().tryRing();
    }

    @Override
    public void ring() {
        this.getClock().setState(this.getClock().getRing());
    }

    @Override
    public void ringStop() {
        System.out.println(">>Clock isn't ringing.");
    }
}
