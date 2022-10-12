package brocodeAter28._44_borderLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
/*
        layout manager = defines the natural layout for components within a container

        3 common managers

        border layout manager =  A border layout manager places components in five areas of the container=>
                                 north , south , east,west and center .  All extra space is allocated to the center of the container
*/

        JFrame frame = new JFrame();   // creating my frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,10));  // BorderLayout(X,Y)   =  X=> LEFT margin by east and RIGHT west
                                                    // ,y => BOTTOM margin by north and RIGHT margin by south
        frame.setVisible(true);
        frame.setSize(500,500);
//        outer panel

        myPanel Panel1= new myPanel(100);
        myPanel Panel2= new myPanel(100);
        myPanel Panel3= new myPanel(100);
        myPanel Panel4= new myPanel(100);
        myPanel Panel5= new myPanel(100);

        Panel1.setBackground(Color.YELLOW);
        Panel2.setBackground(Color.BLACK);
        Panel3.setBackground(Color.CYAN);
        Panel4.setBackground(Color.ORANGE);
        Panel5.setBackground(Color.pink);


//        sub panels

        myPanel subPanel1= new myPanel(50);
        myPanel subPanel2= new myPanel(50);
        myPanel subPanel3= new myPanel(50);
        myPanel subPanel4= new myPanel(50);
        myPanel subPanel5= new myPanel(50);

        subPanel1.setBackground(Color.YELLOW);
        subPanel2.setBackground(Color.BLACK);
        subPanel3.setBackground(Color.CYAN);
        subPanel4.setBackground(Color.ORANGE);
        subPanel5.setBackground(Color.DARK_GRAY);

//        adding panels to frame
        frame.add(Panel1,BorderLayout.NORTH);
        frame.add(Panel2,BorderLayout.SOUTH);
        frame.add(Panel3,BorderLayout.EAST);
        frame.add(Panel4,BorderLayout.WEST);
        frame.add(Panel5,BorderLayout.CENTER);

//        adding sub panels to panel5
        Panel5.setLayout(new BorderLayout(10,10));

        Panel5.add(subPanel1,BorderLayout.NORTH);
        Panel5.add(subPanel2,BorderLayout.SOUTH);
        Panel5.add(subPanel3,BorderLayout.EAST);
        Panel5.add(subPanel4,BorderLayout.WEST);
        Panel5.add(subPanel5,BorderLayout.CENTER);
    }
}
