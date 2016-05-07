package tp3.clock.interfaces;

import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class TimeOutClock extends JPanel {

    private int currentSecond = 0;
    private int currentMinute = 0;
    private int currentHour = 0;
    private boolean timeoutstart = false;
    private Clock c;

    public void pintar(Clock clock){
        repaint();
        revalidate();
        this.c = clock;
        currentSecond = c.getCal().get(Calendar.SECOND);
        currentMinute = c.getCal().get(Calendar.MINUTE);
        currentHour = c.getCal().get(Calendar.HOUR_OF_DAY);
    }

    public void update(Graphics g)
    {
        paint(g);
    }

    private void drawStructure(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));
        g.setColor(Color.black);
        g.drawString("Set TimeOut",175,35);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawStructure(g);
        /*int currentSecond = Calendar.getInstance().get(Calendar.SECOND);
        int currentMinute = Calendar.getInstance().get(Calendar.MINUTE);
        int currentHour = Calendar.getInstance().get(Calendar.HOUR);*/

        g.setFont(new Font("TimesRoman", Font.PLAIN, 55));
        g.setColor(Color.black);
        g.drawString(currentHour+" : "+currentMinute+" : "+currentSecond,135,200);

        if (currentMinute%2==0)
        {
            try {
                if (!timeoutstart)
                {
                    this.c.getTimeOut().getState().createWarning(0, 0, 10);
                    timeoutstart=true;
                }
                double timeLeft = this.c.getTimeOut().getTimeLeft();
                int timeoutHour = (int) (timeLeft/3600);
                int timeoutMinute = (int) ((timeLeft%3600)/60);
                int timeoutSecond = (int) (timeLeft%60);
                g.drawString(timeoutHour+" : "+timeoutMinute+" : "+timeoutSecond,135,295);
                if (timeLeft==0.0) {
                    timeoutstart = false;
                }
            } catch (NullPointerException e)
            {
            }
        }
    }
}
