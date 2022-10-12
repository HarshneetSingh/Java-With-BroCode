package brocodeAter28._47_LayeredPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
/*
        JLayeredPane= swing components that provide a third dimension for positioning components ex depth ,z index.

        JLAYERED SEQUENCE
        DRAG
        POPUP
        MODAL
        PALETTE
        DEFAULT

        in normal case when you add label to the frame .
        the one you add the first in frame that will be show on top means it will have a highest index
*/

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,150,150);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(100,100,150,150);
        
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.YELLOW);
        label3.setBounds(150,150,150,150);
        
        JLayeredPane jLayeredPane = new JLayeredPane();
        jLayeredPane.setBounds(0,0,700,700);

        jLayeredPane.add(label1,Integer.valueOf(2)); // OR (LABEL 1 ,JLayeredPane.DRAG)
        jLayeredPane.add(label2,Integer.valueOf(1));
        jLayeredPane.add(label3,Integer.valueOf(0));

        JFrame frame = new JFrame();   // creating my frame

        frame.add(jLayeredPane);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setVisible(true);
    }
}
