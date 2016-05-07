package tp3.clock;


import tp3.clock.interfaces.*;
import tp3.clock.states.ClockStateRing;
import tp3.clock.states.ClockStateSet;
import tp3.clock.states.ClockStateStopped;
import tp3.clock.warnings.Warning;
import tp3.clock.warnings.alarm.WarningAlarm;
import tp3.clock.warnings.timeOut.WarningTimeOut;

import javax.swing.*;
import java.util.Calendar;

import static java.lang.Thread.sleep;

/***
 * Class Clock is used to hold the data structure together, keeping state
 * and being responsible for the basic Clock functions which cannot be left
 * to the Warning or Interface
 */

public class Clock implements Runnable {

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
    private ClockStateStopped stopped = new ClockStateStopped(this);
    private ClockStateSet set = new ClockStateSet(this);
    private ClockStateRing ring = new ClockStateRing(this);

    /***
     * Design Pattern Observer
     */
    private Interface cur_interface;
    private InterfaceAnalog analog = new InterfaceAnalog(this);
    private InterfaceDigital digital = new InterfaceDigital(this);
    private InterfaceAdjust adjust = new InterfaceAdjust(this);
    private InterfaceAlarm i_alarm = new InterfaceAlarm(this);
    private InterfaceTimeOut i_timeout = new InterfaceTimeOut(this);
    private JFrame window = new JFrame();

    /***
     * Design Pattern State
     */
    private WarningAlarm alarm = new WarningAlarm(this);
    private WarningTimeOut timeOut = new WarningTimeOut(this);

    public Clock(){
        this.setCur_interface(this.getAnalog());
        this.setState(this.getSet());
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
        this.cur_interface.showInterface();
    }

    public InterfaceAnalog getAnalog() {
        return analog;
    }

    public InterfaceDigital getDigital() {
        return digital;
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

    @Override
    public void run() {
        try {
            while (true) {
                sleep(1000);
                this.getState().tick();
                this.getCur_interface().redraw();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ClockStateRing getRing() {
        return ring;
    }
}
