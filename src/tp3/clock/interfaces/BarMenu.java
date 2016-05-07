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
                c.setCur_interface(c.getAnalog());
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
                c.setCur_interface(c.getDigital());
            }
        });
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem(new AbstractAction("Adjust Time") {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.getCur_interface().killinterface();
                c.setCur_interface(c.getAdjust());
            }
        });
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem(new AbstractAction("Alarm") {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.getCur_interface().killinterface();
                c.setCur_interface(c.getI_alarm());
            }
        });
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem(new AbstractAction("TimeOut") {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.getCur_interface().killinterface();
                c.setCur_interface(c.getI_timeout());
            }
        });
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);


        //Build the first menu.
        menu = new JMenu("Actions");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        //a group of radio button menu items
        menu.addSeparator();
        //ButtonGroup group2 = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem(new AbstractAction("Start") {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.getState().start();
            }
        });
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem(new AbstractAction("Stop") {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.getState().stop();
            }
        });
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem(new AbstractAction("StopRinging") {
            @Override
            public void actionPerformed(ActionEvent e) {
                //c.setState(c.get;
            }
        });
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        return menuBar;
    }
}
