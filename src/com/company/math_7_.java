package com.company;

import javax.swing.JOptionPane;

public class math_7_ {
    public static void main(String...args){
        double x= Double.parseDouble(JOptionPane.showInputDialog("Enter x"));
        double y= Double.parseDouble(JOptionPane.showInputDialog("Enter y"));

        double sqrt = Math.sqrt((x * x) + (y * y));


        JOptionPane.showMessageDialog(null,sqrt);
    }


}
