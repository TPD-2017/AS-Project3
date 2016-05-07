package tp3.clock.interfaces;

import tp3.clock.Clock;

import javax.swing.*;
import java.awt.*;

public class AdjustClock extends JPanel {

    private int currentSecond;
    private int currentMinute;
    private int currentHour;

    public void pintar(Clock c, JTextArea textAreaH, JTextArea textAreaM, JTextArea textAreaS){
        String h = textAreaH.getText();
        String m = textAreaM.getText();
        String s = textAreaS.getText();
        if (!h.equals("") && !m.equals("") && !s.equals("")) {
            currentHour = Integer.parseInt(h);
            currentMinute = Integer.parseInt(m);
            currentSecond = Integer.parseInt(s);
            c.getState().adjustTime(currentSecond, currentMinute, currentHour, 0, 0, 0);
        }
        repaint();
        validate();
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
        int currentHour = Calendar.getInstance().get(Calendar.HOUR);

        g.setFont(new Font("TimesRoman", Font.PLAIN, 55));
        g.setColor(Color.black);
        g.drawString(currentHour+" : "+currentMinute+" : "+currentSecond,135,255);*/
    }
}
