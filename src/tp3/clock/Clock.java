package tp3.clock;


import tp3.clock.interfaces.*;
import tp3.clock.states.ClockStateSet;
import tp3.clock.states.ClockStateStopped;
import tp3.clock.warnings.Warning;
import tp3.clock.warnings.alarm.WarningAlarm;
import tp3.clock.warnings.timeOut.WarningTimeOut;

import javax.swing.*;
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
    private ClockState state = this.stopped;
    private ClockStateStopped stopped = new ClockStateStopped(this);
    private ClockStateSet set = new ClockStateSet(this);

    /***
     * Design Pattern Observer
     */
    private Interface cur_interface = this.digital;
    private InterfaceAnalog analog = new InterfaceAnalog(this);
    private InterfaceDigital digital = new InterfaceDigital(this);
    private InterfaceAdjust adjust = new InterfaceAdjust(this);
    private InterfaceAlarm i_alarm = new InterfaceAlarm(this);
    private InterfaceTimeOut i_timeout = new InterfaceTimeOut(this);
    private JFrame window = new JFrame();

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

    public ClockState getState() {
        return state;
    }

    public void setState(ClockState state) {
        this.state = state;
    }

    public ClockStateStopped getStopped() {
        return stopped;
    }

    public ClockStateSet getSet() {
        return set;
    }

    public JFrame getWindow() {
        return window;
    }

    public InterfaceAdjust getAdjust() {
        return adjust;
    }

    public InterfaceAlarm getI_alarm() {
        return i_alarm;
    }

    public InterfaceTimeOut getI_timeout() {
        return i_timeout;
    }
}
