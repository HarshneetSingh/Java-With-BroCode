package brocodeAter28._60_MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class myFrame extends JFrame implements MouseListener {
    ImageIcon image1;
    ImageIcon image2;
    ImageIcon image3;

    JLabel myLabel;

    myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(new FlowLayout());

        myLabel = new JLabel();
        image1= new ImageIcon("src/star1.png");
        image2= new ImageIcon("src/star2.png");
        image3= new ImageIcon("src/star3.png");

        myLabel.setIcon(image1);

        this.add(myLabel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.addMouseListener(this);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        Invoked when the mouse button has been clicked (pressed and released ) on a component
        System.out.println("mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
//      invoked when a mouse button is pressed
        myLabel.setIcon(image3);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
//      invoked when a mouse button is released
        myLabel.setIcon(image2);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
//      invoked when a mouse button is entered selected area
        myLabel.setIcon(image2);

    }

    @Override
    public void mouseExited(MouseEvent e) {
//      invoked when a mouse button is exit selected area
        myLabel.setIcon(image1);

    }
}
