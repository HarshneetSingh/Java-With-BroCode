package brocodeAter28._52_JRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {
    JRadioButton myRadioButton1;
    JRadioButton myRadioButton2;
    JRadioButton myRadioButton3;


    Myframe(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myRadioButton1= new JRadioButton("pizza");
        myRadioButton2= new JRadioButton("burger");
        myRadioButton3= new JRadioButton("coke");

        myRadioButton1.addActionListener(this);
        myRadioButton2.addActionListener(this);
        myRadioButton3.addActionListener(this);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(myRadioButton1);
        buttonGroup.add(myRadioButton2);
        buttonGroup.add(myRadioButton3);

        this.add(myRadioButton1);
        this.add(myRadioButton2);
        this.add(myRadioButton3);

        pack();
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if (myRadioButton1.equals(e.getSource())) {
            System.out.println("pizza it is ");
        } else if (myRadioButton2.equals(e.getSource())){
            System.out.println(" burger it is ");

        }else {
            System.out.println(" coke  it is ");

        }

    }
}
