package tp3.clock.states;

import tp3.clock.Clock;
import tp3.clock.ClockState;

import java.util.Calendar;

/**
 * Created by pedro on 5/6/16.
 */
public class ClockStateStopped extends ClockState {
    public ClockStateStopped(Clock clock) {
        super(clock);
    }

    @Override
    public void adjustTime(int second, int minute, int hour, int day, int month, int year) {
        this.getClock().getCal().set(Calendar.SECOND, second);
        this.getClock().getCal().set(Calendar.MINUTE, minute);
        this.getClock().getCal().set(Calendar.HOUR, hour);
        this.getClock().getCal().set(Calendar.DAY_OF_MONTH, day);
        this.getClock().getCal().set(Calendar.MONTH, month);
        this.getClock().getCal().set(Calendar.YEAR, year);

    }

    @Override
    public void start() {
        this.getClock().setState(this.getClock().getSet());
    }

    @Override
    public void stop() {
        System.out.println(">>Clock is already stopped.");
    }

    @Override
    public void tick() {
        System.out.println(">>Cannot tick: Clock is stopped.");
    }

    @Override
    public void ring() {
        System.out.println(">>Cannot ring: Clock is stopped.");
    }

    @Override
    public void ringStop() {
        System.out.println(">>Clock is not ringing: Clock is stopped.");
    }
}
