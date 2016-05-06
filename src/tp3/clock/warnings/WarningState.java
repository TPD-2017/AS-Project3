package tp3.clock.warnings;

/**
 * Pedro Filipe Dinis Stamm de Matos, 2009116927
 */
public abstract class WarningState {

    private Warning warning;

    public abstract void createWarning(int hour, int minutes, int seconds);

    public abstract void adjustWarning(int hour, int minutes, int seconds);

    public abstract void cancelWarning();

    public abstract void tryRing();

    public Warning getWarning() {
        return warning;
    }
}
