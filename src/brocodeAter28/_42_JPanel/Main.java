package brocodeAter28._42_JPanel;

import javax.swing.*;
import java.awt.*;

public class Main {

//    JPanel function as a container which holds other items
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\yo.png"));
        label.setBounds(10,10,90,90);
        myPanel redPanel= new myPanel(0,0,200,200);    // redPanel
        redPanel.setBackground(Color.red);

        myPanel blackPanel= new myPanel(0,200,200,200);    // blackPanel
        blackPanel.setBackground(Color.black);

        myPanel yellowPanel= new myPanel(200,0,200,200);    // yellowPanel
        yellowPanel.setBackground(Color.yellow);


        JFrame frame = new JFrame();   // creating my frame

        frame.setVisible(true); //     MAKE FRAME VISIBLE
        frame.setSize(700,600);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//  CLOSING FRAME AFTER CLICK ON CROSS BTN  AS (DEFAULT CROSS MEANS HIDING OF FRAME )
        frame.setResizable(true);
        frame.setLayout(null);

//      adding label to  the panel
        redPanel.add(label);

        frame.add(redPanel);
        frame.add(blackPanel);
        frame.add(yellowPanel);


    }
}
