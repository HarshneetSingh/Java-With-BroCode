package brocodeAter28._43_Jbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener{

    JButton myButton ;
    ImageIcon myIcon ;
    JLabel myLabel ;
    int count =0;
    myFrame(){
        myIcon = new ImageIcon("src/yo.png");
        myButton= new JButton();
        myLabel = new JLabel();

        myLabel.setText("0");
        myLabel.setBounds(100,300,250,100);
        myLabel.setForeground(Color.RED);
        myLabel.setFont(new Font("Comic sans", Font.BOLD, 100));
        myLabel.setHorizontalAlignment(JLabel.CENTER);
        myLabel.setBorder(BorderFactory.createEtchedBorder());

        myButton.setText("CLICK");
        myButton.setFont(new Font("Arial", Font.BOLD,30));
        myButton.setForeground(Color.cyan);
        myButton.setBackground(Color.white);
//        myButton.addActionListener(e-> System.out.println("hi"));    lamda function
//                            or
        myButton.addActionListener(this);

        myButton.setFocusable(false);
        myButton.setIcon(myIcon);
        myButton.setVerticalTextPosition(JButton.CENTER);
        myButton.setBounds(100,50,250,100);
        myButton.setBorder(BorderFactory.createEtchedBorder());


        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//  CLOSING FRAME AFTER CLICK ON CROSS BTN  AS (DEFAULT CROSS MEANS HIDING OF FRAME)
        this.setSize(500,500);
        this.add(myButton);
        this.add(myLabel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count=count+1;
        myLabel.setText(String.valueOf(count));
        System.out.println(count);

    }
}
