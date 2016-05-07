package tp3.clock.interfaces;


import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;


public class InterfaceAnalog extends Interface {
    AnalogClock analogclock = new AnalogClock();
    JFrame window;
    public InterfaceAnalog(Clock clock) {
        super(clock);
    }

    @Override
    public void showInterface() {
        //JFrame window = new JFrame();
        window = this.getClock().getWindow();
        window.setBackground(Color.black);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);

        window.getContentPane().add(analogclock);
        BarMenu menuBar = new BarMenu();
        window.setJMenuBar(menuBar.addMenu(this.getClock()));
        window.setVisible(true);
        analogclock.start();
    }

    public void killinterface() {
        window.getContentPane().removeAll();
        analogclock.stop();
    }
}

class AnalogClock extends JPanel implements Runnable {
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
        g.setColor(Color.white);
        g.fillOval(xcenter - 150, ycenter - 150, 300, 300);
        g.setColor(Color.black);
        g.drawString("Analog Clock",175,35);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        month++;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        g.drawString(day+" - "+month+" - "+year,180,65);
        g.setColor(Color.black);
        g.drawString("9", xcenter - 145, ycenter + 0);
        g.drawString("3", xcenter + 135, ycenter + 0);
        g.drawString("12", xcenter - 10, ycenter - 130);
        g.drawString("6", xcenter - 10, ycenter + 145);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawStructure(g);
        int currentSecond = Calendar.getInstance().get(Calendar.SECOND);
        int currentMinute = Calendar.getInstance().get(Calendar.MINUTE);
        int currentHour = Calendar.getInstance().get(Calendar.HOUR);

        int xsecond = (int) (Math.cos(currentSecond * 3.14f / 30 - 3.14f / 2) * 120 + xcenter);
        int ysecond = (int) (Math.sin(currentSecond * 3.14f / 30 - 3.14f / 2) * 120 + ycenter);
        int xminute = (int) (Math.cos(currentMinute * 3.14f / 30 - 3.14f / 2) * 100 + xcenter);
        int yminute = (int) (Math.sin(currentMinute * 3.14f / 30 - 3.14f / 2) * 100 + ycenter);
        int xhour = (int) (Math.cos((currentHour * 30 + currentMinute / 2) * 3.14f / 180 - 3.14f / 2) * 80 + xcenter);
        int yhour = (int) (Math.sin((currentHour * 30 + currentMinute / 2) * 3.14f / 180 - 3.14f / 2) * 80 + ycenter);

        g.setColor(Color.black);
        if (xsecond != lastxs || ysecond != lastys)
        {
            g.drawLine(xcenter, ycenter, lastxs, lastys);
        }
        if (xminute != lastxm || yminute != lastym)
        {
            g.drawLine(xcenter, ycenter - 1, lastxm, lastym);
            g.drawLine(xcenter - 1, ycenter, lastxm, lastym);
        }
        if (xhour != lastxh || yhour != lastyh)
        {
            g.drawLine(xcenter, ycenter - 1, lastxh, lastyh);
            g.drawLine(xcenter - 1, ycenter, lastxh, lastyh);
        }
        g.setColor(Color.black);
        g.drawLine(xcenter, ycenter, xsecond, ysecond);
        g.setColor(Color.black);
        g.drawLine(xcenter, ycenter - 1, xminute, yminute);
        g.drawLine(xcenter - 1, ycenter, xminute, yminute);
        g.setColor(Color.black);
        g.drawLine(xcenter, ycenter - 1, xhour, yhour);
        g.drawLine(xcenter - 1, ycenter, xhour, yhour);
        lastxs = xsecond;
        lastys = ysecond;
        lastxm = xminute;
        lastym = yminute;
        lastxh = xhour;
        lastyh = yhour;
    }
}
