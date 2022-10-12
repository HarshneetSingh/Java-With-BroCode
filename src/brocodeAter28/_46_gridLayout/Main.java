package brocodeAter28._46_gridLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        Grid layout= places components in a grid of cells ,each component takes all the available space within its
//                     cells and each cell is the same size .

        JFrame frame = new JFrame();   // creating my frame
          frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3,3,10,10));  //4 param (rows , coloumns ,horizental margin ,vertical margin)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton(String.valueOf(i)));
        }


        frame.setVisible(true);

    }
}
