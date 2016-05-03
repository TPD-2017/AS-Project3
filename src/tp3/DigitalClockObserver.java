package tp3;


import javax.swing.*;
import java.awt.*;

public class DigitalClockObserver extends Interface {

    @Override
    public void showTime() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("AS_TP3 - Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Digital");
        frame.getContentPane().add(label);
        frame.getContentPane().setPreferredSize(new Dimension(500, 500));
        frame.getContentPane().setBackground(Color.white);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void adjustTime() {

    }

    @Override
    public void createAlarm() {

    }

    @Override
    public void cancelAlarm() {

    }

    @Override
    public void createTimeOut() {

    }

    @Override
    public void cancelTimeOut() {

    }
}
