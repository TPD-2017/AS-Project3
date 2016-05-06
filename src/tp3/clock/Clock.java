package tp3.clock;


import tp3.clock.interfaces.Interface;
import tp3.clock.interfaces.InterfaceAnalog;
import tp3.clock.interfaces.InterfaceDigital;
import tp3.clock.warnings.Warning;
import tp3.clock.warnings.alarm.WarningAlarm;
import tp3.clock.warnings.timeOut.WarningTimeOut;

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

    private Calendar cal = Calendar.getInstance();

    /***
     * Design Pattern State
     */
    private ClockState state;

    /***
     * Design Pattern Observer
     */
    private Interface cur_interface;
    private InterfaceAnalog analog = new InterfaceAnalog(this);
    private InterfaceDigital digital = new InterfaceDigital(this);

    /***
     * Design Pattern State
     */
    private Warning cur_warning;
    private WarningAlarm alarm;
    private WarningTimeOut timeOut;

    public Clock(){
        this.cur_interface=this.getDigital();

        /***
         *
         this.cal.set(Calendar.YEAR, year);
         this.cal.set(Calendar.MONTH, month);
         this.cal.set(Calendar.DAY_OF_MONTH, day);
         this.cal.set(Calendar.HOUR, hour);
         this.cal.set(Calendar.MINUTE, minutes);
         this.cal.set(Calendar.SECOND, seconds);
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
}
