package tp3.clock.interfaces;

import javax.swing.*;
import java.awt.*;

public class AlarmClock extends JPanel {

    public void pintar(){
        repaint();
        revalidate();
    }

    public void update(Graphics g)
    {
        paint(g);
    }

    private void drawStructure(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));
        g.setColor(Color.black);
        g.drawString("Set Alarm",175,35);
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
