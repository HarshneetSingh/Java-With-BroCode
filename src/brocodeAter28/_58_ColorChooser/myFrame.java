package brocodeAter28._58_ColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {

    JButton myButton;
    JLabel myLabel;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        myButton = new JButton("pick a color");
        myButton.addActionListener(this);

        myLabel = new JLabel("color gonna change ");
        myLabel.setFont(new Font("MV Boli", Font.BOLD, 100));
        myLabel.setOpaque(true);
        myLabel.setBackground(Color.YELLOW);

        this.add(myButton);
        this.add(myLabel);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton){
//            JColorChooser chooser = new JColorChooser();
            Color color= JColorChooser.showDialog(null,"pick a color noob",Color.CYAN);

            myLabel.setForeground(color);
        }
    }
}
