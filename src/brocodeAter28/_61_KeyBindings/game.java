package brocodeAter28._61_KeyBindings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class game extends JFrame {
    JLabel myLabel;

    Action upAction = new upAction();
    Action downAction = new downAction();
    Action leftAction = new leftAction();
    Action rightAction = new rightAction();

    game(){
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        myLabel= new JLabel();
        myLabel.setOpaque(true);
        myLabel.setBackground(Color.YELLOW);
        myLabel.setBounds(100,100,100,100);



        myLabel.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
        myLabel.getActionMap().put("upAction",upAction);
        myLabel.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
        myLabel.getActionMap().put("downAction",downAction);
        myLabel.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        myLabel.getActionMap().put("rightAction",rightAction);
        myLabel.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
        myLabel.getActionMap().put("leftAction",leftAction);

        this.add(myLabel);
        this.setVisible(true);
    }

    public class upAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            myLabel.setLocation(myLabel.getX(),myLabel.getY()-10);
        }
    }
    public class downAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            myLabel.setLocation(myLabel.getX(),myLabel.getY()+10);

        }
    }
    public class leftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            myLabel.setLocation(myLabel.getX()-10,myLabel.getY());

        }
    }
    public class rightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            myLabel.setLocation(myLabel.getX()+10,myLabel.getY());

        }
    }


}
