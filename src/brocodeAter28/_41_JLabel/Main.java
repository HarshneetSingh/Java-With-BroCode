package brocodeAter28._41_JLabel;


import brocodeAter28._40_Jframe_GUI.myFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        myFrame frame = new myFrame();  // creating my frame from myFrame

        Border border = BorderFactory.createLineBorder(Color.black,3);// creating my border

        JLabel label = new JLabel();// creating my label


        label.setText("Welcome To Lv's");// SETTING TEXT
        label.setForeground(Color.white);
        label.setFont(new Font("Arial", Font.BOLD,20));
        label.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\JAVASCRIPT\\E-commerce js\\img\\a1.jpg"));// SETTING IMG
        label.setHorizontalTextPosition(JLabel.CENTER);// OPTIONS FOR HORIZONTAL TEXT position IS LEFT CENTER RIGHT
        label.setVerticalTextPosition(JLabel.TOP); // OPTIONS FOR VERTICAL TEXT position IS TOP CENTER BOTTOM
        label.setBorder(border);// setting border
        label.setBackground(Color.blue);// setting background color
        label.setOpaque(true);//displaying background color (neccessary for background color change)
//        label.setBounds(0,0,700,500);//set x and y position within frame as well as dimensions
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal alignment
        label.setVerticalAlignment(JLabel.CENTER);//set vertical alignment
        label.setIconTextGap(25);

//        frame.setLayout(null);// SETTING LAYOUT FOR NULL
        frame.add(label);// ADDING LABEL TO THE FRAME
        frame.pack();
    }
}



