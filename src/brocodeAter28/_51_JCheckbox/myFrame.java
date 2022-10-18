package brocodeAter28._51_JCheckbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {

    JButton myButton;
    JCheckBox myCheckBox;

    myFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());



        myButton = new JButton("submit");
        myButton.setSize(100,40);
        myButton.addActionListener(this);


        myCheckBox = new JCheckBox();
        myCheckBox.setText("I'm not a robot!");
        myCheckBox.setFont(new Font("Arial", Font.BOLD, 20));
        myCheckBox.setFocusable(false);
        myCheckBox.setIcon(new ImageIcon("src/cross.png"));
        myCheckBox.setSelectedIcon(new ImageIcon("src/right.png"));

        this.add(myButton);
        this.add(myCheckBox);

        pack();
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()== myButton){
        System.out.println(myCheckBox.isSelected());
    }
    }
}
