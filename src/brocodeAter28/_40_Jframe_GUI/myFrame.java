package brocodeAter28._40_Jframe_GUI;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {

    public myFrame(){

        this.setTitle("Experimenting JFrame");
        this.setResizable(true);//  UNABLE TO RESIZE THE FRAME WINDOW
        this.setSize(500,500);// SETTING WIDTH AND HEIGHT
        this.getContentPane().setBackground(new Color(123,50,150));// BACKGROUND COLOR SETTING
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);//  CLOSING FRAME AFTER CLICK ON CROSS BTN  AS (DEFAULT CROSS MEANS HIDING OF FRAME )

        ImageIcon imageIcon=new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\Louis-Vuitton-Logo.jpg");
        this.setIconImage(imageIcon.getImage());
        this.setVisible(true); //     MAKE FRAME VISIBLE
    }

}
