package tp3.clock.interfaces;


import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class InterfaceAdjust extends Interface {
    JFrame window;
    AdjustClock adjustclock = new AdjustClock();

    public InterfaceAdjust(Clock clock) {
        super(clock);
    }

    @Override
    public void showInterface() {
        window = this.getClock().getWindow();
        //window.setBackground(Color.black);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);

        BarMenu menuBar = new BarMenu();
        window.setJMenuBar(menuBar.addMenu(this.getClock()));
        window.getContentPane().add(adjustclock);
        window.setVisible(true);
    }

    @Override
    public void redraw() {
        adjustclock.pintar();
    }

    @Override
    public void killinterface() {
        window.getContentPane().removeAll();
    }
}

