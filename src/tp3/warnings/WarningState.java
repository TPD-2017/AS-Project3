package tp3.warnings;

import tp3.warnings.Warning;

/**
 * Integração de Sistemas
 * Pedro Filipe Dinis Stamm de Matos, 2009116927
 */
public abstract class WarningState {

    private Warning warning;

    public abstract void createWarning(int hour, int minutes, int seconds);

    public abstract void adjustWarning(int hour, int minutes, int seconds);

    public abstract void changeWarning();

    public abstract void cancelWarning();

    public abstract void tryRing();

    protected abstract void ring();
}
