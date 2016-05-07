package tp3.clock.interfaces;

import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Calendar;

public class DigitalClock extends JPanel {

    private String currentSecond;
    private String currentMinute;
    private String currentHour;

    DecimalFormat formatter = new DecimalFormat("00");

    public void pintar(Clock c){
        repaint();
        revalidate();
        currentSecond = formatter.format(c.getCal().get(Calendar.SECOND));
        currentMinute = formatter.format(c.getCal().get(Calendar.MINUTE));
        currentHour = formatter.format(c.getCal().get(Calendar.HOUR_OF_DAY));
    }

    public void update(Graphics g)
    {
        paint(g);
    }

    private void drawStructure(Graphics g) {
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
        //int currentSecond = Calendar.getInstance().get(Calendar.SECOND);
        //int currentMinute = Calendar.getInstance().get(Calendar.MINUTE);
        //int currentHour = Calendar.getInstance().get(Calendar.HOUR);

        g.setFont(new Font("TimesRoman", Font.PLAIN, 55));
        g.setColor(Color.black);
        g.drawString(currentHour+" : "+currentMinute+" : "+currentSecond,135,255);
    }
}
