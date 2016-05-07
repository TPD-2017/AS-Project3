package tp3.clock.interfaces;

import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class AdjustClock extends JPanel {

    private int currentSecond;
    private int currentMinute;
    private int currentHour;
    private int currentDay;
    private int currentMonth;
    private int currentYear;
    Clock c;

    public void pintar(Clock clock){
        repaint();
        validate();
        this.c = clock;
        currentSecond = c.getCal().get(Calendar.SECOND);
        currentMinute = c.getCal().get(Calendar.MINUTE);
        currentHour = c.getCal().get(Calendar.HOUR_OF_DAY);
        currentDay = c.getCal().get(Calendar.DAY_OF_MONTH);
        currentMonth = c.getCal().get(Calendar.MONTH);
        currentYear = c.getCal().get(Calendar.YEAR);
    }

    public void update(Graphics g)
    {
        paint(g);
    }

    private void drawStructure(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));
        g.setColor(Color.black);
        g.drawString("Adjust Clock",175,35);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawStructure(g);

        /*int currentSecond = Calendar.getInstance().get(Calendar.SECOND);
        int currentMinute = Calendar.getInstance().get(Calendar.MINUTE);
        int currentHour = Calendar.getInstance().get(Calendar.HOUR);*/

        g.setFont(new Font("TimesRoman", Font.PLAIN, 55));
        g.setColor(Color.black);
        g.drawString(currentHour+" : "+currentMinute+" : "+currentSecond,135,255);

        if (currentMinute==5){
            this.c.getState().adjustTime(currentSecond, currentMinute, currentHour-1, currentDay, currentMonth, currentYear);
        }
    }
}
