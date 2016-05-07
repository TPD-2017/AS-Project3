package tp3.clock.interfaces;

import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;

public class InterfaceTimeOut extends Interface {
    private JFrame window;
    private TimeOutClock timeoutclock = new TimeOutClock();
    public InterfaceTimeOut(Clock clock) {
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
        window.getContentPane().add(timeoutclock);
        window.setVisible(true);
    }

    public void redraw(){
        timeoutclock.pintar();
    }

    @Override
    public void killinterface() {
        window.getContentPane().removeAll();
    }
}

