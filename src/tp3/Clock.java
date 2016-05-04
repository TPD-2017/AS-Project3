package tp3;


public class Clock {
    private Interface cur_interface;
    private InterfaceAnalog analog;
    private InterfaceDigital digital;

    private int hour;
    private int minutes;
    private int seconds;

    public Clock(){
        this.analog = new InterfaceAnalog(this);
        this.digital = new InterfaceDigital(this);
        this.cur_interface=this.digital;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Interface getCur_interface() {
        return cur_interface;
    }

    public void setCur_interface(Interface cur_interface) {
        this.cur_interface = cur_interface;
    }

    public InterfaceAnalog getAnalog() {
        return analog;
    }

    public InterfaceDigital getDigital() {
        return digital;
    }

}
