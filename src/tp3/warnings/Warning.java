package tp3.warnings;

import tp3.Clock;

/**
 * Created by pedro on 5/4/16.
 */
public abstract class Warning {
    private Clock clock;

    public Warning(Clock clock){
        this.clock=clock;
    }

    public abstract void createWarning();

    public abstract void adjustWarning();

    public abstract void cancelWarning();
}
