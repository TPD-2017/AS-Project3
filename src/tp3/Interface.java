package tp3;


public abstract class Interface {

    private Clock clock;

    public Interface(Clock clock){
        this.clock = clock;
    }

    public abstract void showTime();
}
