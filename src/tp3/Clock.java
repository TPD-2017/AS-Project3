package tp3;


import tp3.interfaces.Interface;
import tp3.interfaces.InterfaceAnalog;
import tp3.interfaces.InterfaceDigital;
import tp3.warnings.Warning;
import tp3.warnings.WarningAlarm;
import tp3.warnings.WarningTimeOut;

import java.util.Calendar;

/***
 * Class Clock is used to hold the data structure together, keeping state
 * and being responsible for the basic Clock functions which cannot be left
 * to the Warning or Interface
 */

public class Clock {

    /*
    private int hour=0;
    private int minutes=0;
    private int seconds=0;
    */

    private Calendar cal;


    /***
     * Design Pattern Observer
     */
    private Interface cur_interface;
    private InterfaceAnalog analog;
    private InterfaceDigital digital;

    /***
     * Design Pattern State
     */
    private Warning cur_warning;
    private WarningAlarm alarm;
    private WarningTimeOut timeOut;

    public Clock(int hour, int minutes, int seconds){
        this.setHour(hour);
        this.setMinutes(minutes);
        this.setSeconds(seconds);

        this.analog = new InterfaceAnalog(this);
        this.digital = new InterfaceDigital(this);
        this.cur_interface=this.getDigital();

        this.alarm = new WarningAlarm(this);
        this.timeOut = new WarningTimeOut(this);
        this.cur_warning = this.getTimeOut();
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

    public Warning getCur_warning() {
        return cur_warning;
    }

    public void setCur_warning(Warning cur_warning) {
        this.cur_warning = cur_warning;
    }

    public WarningAlarm getAlarm() {
        return alarm;
    }

    public WarningTimeOut getTimeOut() {
        return timeOut;
    }
}
