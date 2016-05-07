package tp3.clock.interfaces;


import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class InterfaceDigital extends Interface {
    private JFrame window;
    private DigitalClock digitalclock = new DigitalClock();
    public InterfaceDigital(Clock clock) {
        super(clock);
    }

    @Override
    public void showInterface() {
        window = this.getClock().getWindow();
        window.setBackground(Color.black);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);

        BarMenu menuBar = new BarMenu();
        window.setJMenuBar(menuBar.addMenu(this.getClock()));
        window.getContentPane().add(digitalclock);
        window.setVisible(true);
        //digitalclock.start();
    }

    @Override
    public void redraw() {
        digitalclock.pintar(this.getClock());
    }

    @Override
    public void killinterface() {
        window.getContentPane().removeAll();
        //digitalclock.stop();
    }
}

