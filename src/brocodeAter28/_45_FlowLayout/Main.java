package brocodeAter28._45_FlowLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
/*
        FLOW LAYOUT = PLACES COMPONENTS  IN A ROW , SIZED AT THERE preferred size .
                        if the horizontal space in the container is too small
                      ,the flow layout class uses the next available row


                      three types of flow layout

                      1) leading = it starts from the beginning
                      2) trailing = it starts from the end
                      3) center = it starts from the center (and it is the default one )

                      three  parameters it takes .

                      1) type
                      2) horizontal margin
                      3) vertical margin
*/

    public static void main(String[] args) {
        JFrame frame = new JFrame();   // creating my frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));


        for (int i = 1; i <= 10; i++) {
            frame.add(new JButton(String.valueOf(i)));
        }

        frame.setVisible(true);
    }
}
