package brocodeAter28._48_OpeningNewWindow;

import javax.swing.*;
import java.awt.*;

public class NewPage {
    myFrame frame = new myFrame();
    JLabel label = new JLabel();

    NewPage(){
        label.setText("hello");
        label.setFont(new Font(null, Font.BOLD,40));
        label.setBounds(140,150,200,200);
        label.setOpaque(true);
        label.setBackground(Color.YELLOW);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
    }

}
