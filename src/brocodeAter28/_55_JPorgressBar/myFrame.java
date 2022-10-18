package brocodeAter28._55_JPorgressBar;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ChangeListener ,ActionListener{
    JPanel myPanel;
    JLabel myLabel;
    JSlider mySlider;
    JButton myButton;
    JPanel myPanel2;
    JProgressBar myProgressBar;
    myFrame() throws InterruptedException {
        myPanel = new JPanel();
        myPanel2 = new JPanel();
        myLabel = new JLabel();
        mySlider = new JSlider();
        myProgressBar = new JProgressBar();
        myButton = new JButton("SUBMIT");

        setSize(700,700);
        setLayout(null);
//        slider in making

        myPanel.setBounds(0,0,700,400);
        myPanel.setBackground(Color.CYAN);
        myLabel.setText("C = " + mySlider.getValue());

        mySlider.setPaintLabels(true);
        mySlider.setPaintTicks(true);
        mySlider.setPaintTrack(true);
        mySlider.setMajorTickSpacing(25);
        mySlider.setMinorTickSpacing(10);
        mySlider.addChangeListener(this);

        mySlider.setOrientation(SwingConstants.VERTICAL);

        myButton.addActionListener(this);

        myPanel.add(mySlider);
        myPanel.add(myLabel);
        myPanel.add(myButton);
//        myProgressBar in making
        myPanel2.setBounds(0,500,700,70);
        myPanel2.setBackground(Color.BLACK);


        myProgressBar.setPreferredSize(new Dimension(700,60));
        myProgressBar.setValue(50); // to set default value
        myProgressBar.setStringPainted(true);//   to show percentage progress

        myPanel2.add(myProgressBar);

//        adding both panels in it
        this.add(myPanel2);
        this.add(myPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    @Override
    public void stateChanged(ChangeEvent e) {
        myLabel.setText("C = " + mySlider.getValue());
    }
    public void fill(int value)  {
        int counter = 0;
        while(counter<=value){

            try {
                myProgressBar.setValue(counter); // to set default value
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter+=1;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(mySlider.getValue());
        fill(mySlider.getValue());
    }
}
