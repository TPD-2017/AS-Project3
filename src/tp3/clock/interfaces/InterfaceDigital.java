package tp3.clock.interfaces;


import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class InterfaceDigital extends Interface {
    JFrame window;
    DigitalClock digitalclock = new DigitalClock();
    public InterfaceDigital(Clock clock) {
        super(clock);
    }

    @Override
    public void showTime() {
        window = this.getClock().getWindow();
        window.setBackground(Color.black);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);

        BarMenu menuBar = new BarMenu();
        window.setJMenuBar(menuBar.addMenu(this.getClock()));
        window.getContentPane().add(digitalclock);
        window.setVisible(true);
        digitalclock.start();
    }

    @Override
    public void killinterface() {
        window.getContentPane().removeAll();
        digitalclock.stop();
    }
}

class DigitalClock extends JPanel implements Runnable {
    private Thread thread = null;
    private int xcenter = 240, ycenter = 240;
    private int lastxs = 0, lastys = 0, lastxm = 0, lastym = 0, lastxh = 0,lastyh = 0;

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
        while (thread != null)
        {
            try
            {
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
        g.drawString("Digital Clock",175,35);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        month++;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        g.drawString(day+" - "+month+" - "+year,180,65);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawStructure(g);
        int currentSecond = Calendar.getInstance().get(Calendar.SECOND);
        int currentMinute = Calendar.getInstance().get(Calendar.MINUTE);
        int currentHour = Calendar.getInstance().get(Calendar.HOUR);

        g.setFont(new Font("TimesRoman", Font.PLAIN, 55));
        g.setColor(Color.black);
        g.drawString(currentHour+" : "+currentMinute+" : "+currentSecond,135,255);
    }
}
