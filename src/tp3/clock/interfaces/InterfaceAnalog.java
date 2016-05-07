package tp3.clock.interfaces;


import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;


public class InterfaceAnalog extends Interface {

    private AnalogClock analogclock = new AnalogClock();
    private JFrame window;
    public InterfaceAnalog(Clock clock) {
        super(clock);
    }

    @Override
    public void showInterface() {
        window = this.getClock().getWindow();
        window.setBackground(Color.black);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);

        window.getContentPane().add(analogclock);
        BarMenu menuBar = new BarMenu();
        window.setJMenuBar(menuBar.addMenu(this.getClock()));
        window.setVisible(true);
    }

    public void redraw(){
        analogclock.pintar(this.getClock());
    }

    public void killinterface() {
        window.getContentPane().removeAll();
    }
}

