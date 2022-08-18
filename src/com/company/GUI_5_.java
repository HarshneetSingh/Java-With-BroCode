package com.company;
import javax.swing.JOptionPane;
public class GUI_5_ {
    public static void main(String...args){

        String name = JOptionPane.showInputDialog("What is your name?");
        int age  = Integer.parseInt(JOptionPane.showInputDialog("What is age?"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));

        JOptionPane.showMessageDialog(null,"Your name is "+name+" Age is "+age+" and Height is "+height);
    }
}
//showInputDialog for taking input ;

//showMessageDialog for displaying the input ;