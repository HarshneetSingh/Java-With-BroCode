package brocodeAter28._48_OpeningNewWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener{
    myFrame frame = new myFrame();   // creating my frame
    JButton button = new JButton("LaunchPage");

    LaunchPage(){
        button.addActionListener( this);
        button.setFocusable(false);
        button.setBounds(140,150,150,50);

       frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        NewPage page = new NewPage();
    }
}
