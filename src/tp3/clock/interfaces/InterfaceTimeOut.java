package tp3.clock.interfaces;

import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;

public class InterfaceTimeOut extends Interface {
    JFrame window;
    TimeOutClock timeoutclock = new TimeOutClock();
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
        timeoutclock.start();
    }

    @Override
    public void killinterface() {
        window.getContentPane().removeAll();
        timeoutclock.stop();
    }
}

class TimeOutClock extends JPanel implements Runnable {
    private Thread thread = null;

    public void start()
    {
        if (thread == null)
        {
            thread = new Thread(this);
            thread.start();
        }
    }
    public void stop()
    {
        thread = null;
    }
    public void run()
    {
        while (thread != null) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {}
            repaint();
            revalidate();
        }
        thread = null;
    }
    public void update(Graphics g)
    {
        paint(g);
    }

    public void drawStructure(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));
        g.setColor(Color.black);
        g.drawString("Set TimeOut",175,35);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawStructure(g);
        /*int currentSecond = Calendar.getInstance().get(Calendar.SECOND);
        int currentMinute = Calendar.getInstance().get(Calendar.MINUTE);
        int currentHour = Calendar.getInstance().get(Calendar.HOUR);

        g.setFont(new Font("TimesRoman", Font.PLAIN, 55));
        g.setColor(Color.black);
        g.drawString(currentHour+" : "+currentMinute+" : "+currentSecond,135,255);*/
    }
}
