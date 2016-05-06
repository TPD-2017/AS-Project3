package tp3;


import tp3.interfaces.Interface;
import tp3.interfaces.InterfaceAnalog;
import tp3.interfaces.InterfaceDigital;
import tp3.warnings.Warning;
import tp3.warnings.alarm.WarningAlarm;
import tp3.warnings.timeOut.WarningTimeOut;

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

    public Clock(int year, int month, int day, int hour, int minutes, int seconds){
        this.cal = Calendar.getInstance();
        this.cal.set(Calendar.YEAR, year);
        this.cal.set(Calendar.MONTH, month);
        this.cal.set(Calendar.DAY_OF_MONTH, day);
        this.cal.set(Calendar.HOUR, hour);
        this.cal.set(Calendar.MINUTE, minutes);
        this.cal.set(Calendar.SECOND, seconds);

        this.analog = new InterfaceAnalog(this);
        this.digital = new InterfaceDigital(this);
        this.cur_interface=this.getDigital();

        /***
        this.alarm = new WarningAlarm(this);
        this.timeOut = new WarningTimeOut(this);
        this.cur_warning = this.getTimeOut();
         */
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

    public Calendar getCal() {
        return cal;
    }

    public void setCal(Calendar cal) {
        this.cal = cal;
    }
}
