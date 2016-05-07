package tp3.clock.interfaces;

import tp3.clock.Clock;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class BarMenu {
    public JMenuBar addMenu (final Clock c){
        JMenuBar menuBar;
        JMenu menu;
        JRadioButtonMenuItem rbMenuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Interface");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        //a group of radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem(new AbstractAction("Analog") {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.getCur_interface().killinterface();
                c.getAnalog().showInterface();
            }
        });
        //rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem(new AbstractAction("Digital") {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.getCur_interface().killinterface();
                c.getDigital().showInterface();
            }
        });
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem(new AbstractAction("Adjust Time") {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.getCur_interface().killinterface();
                //c.getAdjust().showInterface();
            }
        });
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem(new AbstractAction("Alarm") {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.getCur_interface().killinterface();
                //c.getAlarm().showInterface();
            }
        });
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem(new AbstractAction("TimeOut") {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.getCur_interface().killinterface();
                //c.getTimeOut().showInterface();
            }
        });
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        return menuBar;
    }
}
