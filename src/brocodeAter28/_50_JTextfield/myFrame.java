package brocodeAter28._50_JTextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {
    JButton myButton;
    JTextField myTextField;
    myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        myButton = new JButton("submit");
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        myTextField= new JTextField();
        myTextField.setText("Username");
        myTextField.setPreferredSize(new Dimension(400,40));
        myTextField.setBackground(Color.BLACK);
        myTextField.setForeground(Color.RED);
        myTextField.setFont(new Font("Consolas", Font.PLAIN,25));
        myTextField.setCaretColor(Color.WHITE);

        this.add(myButton);
        this.add(myTextField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            System.out.println(myTextField.getText());
            myTextField.setEditable(false);
            myButton.setEnabled(false);
        }
    }
}
