package brocodeAter28._54_Jslider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class myFrame extends JFrame implements ChangeListener {
    JSlider mySlider;
    JPanel myPanel;
    JLabel myLabel;

    myFrame(){
        myPanel= new JPanel();
        myLabel = new JLabel();

        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mySlider = new JSlider(0,100,50);  // params = (starting point , end point , point where you need knob as default )
        mySlider.setPreferredSize(new Dimension(200,500));
        mySlider.addChangeListener(this);

//        setting orientations
        mySlider.setOrientation(SwingConstants.VERTICAL);

//        setting ticks and labels
        mySlider.setPaintTicks(true);
        mySlider.setMinorTickSpacing(10);

        mySlider.setPaintTrack(true);
        mySlider.setMajorTickSpacing(25);

        mySlider.setPaintLabels(true);

//        adding slider and label to panel
        myLabel.setFont(new Font("Arial", Font.BOLD, 30));

        myPanel.add(mySlider);
        myPanel.add(myLabel);

//        adding panel to frame
        this.add(myPanel);
        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        myLabel.setText("C ="+ mySlider.getValue());
    }
}
