package tp3.clock.states;

import tp3.clock.Clock;
import tp3.clock.ClockState;

import java.util.Calendar;

/**
 * Created by pedro on 5/6/16.
 */
public class ClockStateRing extends ClockState {
    public ClockStateRing(Clock clock) {
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
        this.getClock().setState(this.getClock().getStopped());
    }

    @Override
    public void tick() {
        this.getClock().getCal().add(Calendar.SECOND, 1);
        this.getClock().getAlarm().getState().tryRing();
        this.getClock().getTimeOut().getState().tryRing();
        System.out.println(">>>>>>>>>IT'S RINGING<<<<<<<<<<<");
    }

    @Override
    public void ring() {
        System.out.println(">>Clock is already ringing.");
    }

    @Override
    public void ringStop() {
        this.getClock().setState(this.getClock().getSet());
    }
}
