package tp3.clock.interfaces;


import tp3.clock.Clock;

import javax.swing.*;

public class InterfaceAdjust extends Interface {
    private JFrame window;
    private AdjustClock adjustclock = new AdjustClock();

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
        //window.getContentPane().add(textFieldH);
        window.setVisible(true);
    }

    @Override
    public void redraw() {
        adjustclock.pintar(this.getClock(), this.getClock().getWindow());
    }

    @Override
    public void killinterface() {
        window.getContentPane().removeAll();
    }
}

