package tp3.warnings;

import tp3.Clock;

/**
 * Created by pedro on 5/4/16.
 */

/***
 * Warning and its subclasses follow the State design pattern, making it so
 * the Clock can try to raise the alarm without fully knowing its state
 * or how it functions internally.
 *
 * A side effect of this design pattern is the impossibility of having both
 * and alarm and a timer set and running at the same time.
 */
public abstract class Warning {
    protected Clock clock;

    public Warning(Clock clock){
        this.clock=clock;
    }

    protected Clock getClock() {
        return clock;
    }
}
