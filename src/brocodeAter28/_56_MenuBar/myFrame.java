package brocodeAter28._56_MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class myFrame extends JFrame implements ActionListener {

    JMenuBar myMenuBar;
    JMenu Menu1;
    JMenu Menu2;
    JMenu Menu3;

    JMenuItem item1;
    JMenuItem item2;
    JMenuItem item3;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.setSize(500, 500);

        myMenuBar = new JMenuBar();
        myMenuBar.setPreferredSize(new Dimension(this.getWidth() - 15, 20));

        Menu1 = new JMenu("File");
        Menu2 = new JMenu("Edit");
        Menu3 = new JMenu("Help");


//        setting keywords for menus .. you can acheived it by alt+ alphabet
        Menu1.setMnemonic(KeyEvent.VK_F);
        Menu2.setMnemonic(KeyEvent.VK_E);
        Menu3.setMnemonic(KeyEvent.VK_H);

        item1 = new JMenuItem("Load");
        item2 = new JMenuItem("Save");
        item3 = new JMenuItem("Exit");
//      adding action listener
        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);

//        setting   keywords    for menuitems you can acheived it by alphabet only
        item1.setMnemonic(KeyEvent.VK_L);
        item2.setMnemonic(KeyEvent.VK_S);
        item3.setMnemonic(KeyEvent.VK_E);

//adding items to menu 1
        Menu1.add(item1);
        Menu1.add(item2);
        Menu1.add(item3);
//       adding menus to menubar
        myMenuBar.add(Menu1);
        myMenuBar.add(Menu2);
        myMenuBar.add(Menu3);

        this.add(myMenuBar);
        this.setVisible(true);
        System.out.println(this.myMenuBar.getWidth());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == item1) {
            System.out.println("loaded");
        } else if (e.getSource() == item2) {
            System.out.println("Saved");
        } else if (e.getSource() == item3) {
            System.exit(0);
        }
    }
}
