package tp3.clock.interfaces;

import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;

public class InterfaceAlarm extends Interface {
    JFrame window;
    AlarmClock alarmclock = new AlarmClock();
    public InterfaceAlarm(Clock clock) {
        super(clock);
    }

    @Override
    public void showInterface() {
        window = this.getClock().getWindow();
        window.setBackground(Color.white);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);

        BarMenu menuBar = new BarMenu();
        window.setJMenuBar(menuBar.addMenu(this.getClock()));
        window.getContentPane().add(alarmclock);
        window.setVisible(true);
    }

    @Override
    public void redraw() {

    }

    @Override
    public void killinterface() {
        window.getContentPane().removeAll();
    }
}

