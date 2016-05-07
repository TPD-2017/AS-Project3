package tp3.clock.states;

import tp3.clock.Clock;
import tp3.clock.ClockState;

import java.util.Calendar;

/**
 * Created by pedro on 5/6/16.
 */
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
        this.getClock().setState(this.getClock().getStopped());
    }

    @Override
    public void tick() {
        this.getClock().getCal().roll(Calendar.SECOND, true);
        this.getClock().getCur_interface().showInterface();
    }

    @Override
    public void ring() {
        //SET STATE TO RIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIING
    }

    @Override
    public void ringStop() {
        System.out.println(">>Clock isn't ringing.");
    }
}
