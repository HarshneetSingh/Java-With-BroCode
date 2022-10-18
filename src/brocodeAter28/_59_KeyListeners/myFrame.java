package brocodeAter28._59_KeyListeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class myFrame extends JFrame implements KeyListener {

    JLabel myLabel;

    myFrame() {
        this.setName("myFrame");
        this.addKeyListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);

        myLabel = new JLabel();
        myLabel.setBounds(100, 100, 50, 50);
        myLabel.setBackground(Color.RED);
        myLabel.setOpaque(true);
        this.add(myLabel);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
//    keytyped= invoked when a key is typed . uses keychar , char output

        switch (e.getKeyChar()) {
            case ('a') -> myLabel.setLocation(myLabel.getX() - 10, myLabel.getY());
            case ('w') -> myLabel.setLocation(myLabel.getX(), myLabel.getY() - 10);
            case ('d') -> myLabel.setLocation(myLabel.getX() + 10, myLabel.getY());
            case ('s') -> myLabel.setLocation(myLabel.getX(), myLabel.getY() + 10);
            default -> throw new IllegalStateException("Unexpected value: " + e.getKeyChar());
        }
    }
//you can use dono mai se
    @Override
    public void keyPressed(KeyEvent e) {
//  keyPressed= invoked when a physical key is pressed down uses keycode, int output
        switch (e.getKeyCode()) {
            case (65) -> myLabel.setLocation(myLabel.getX() - 10, myLabel.getY());
            case (87) -> myLabel.setLocation(myLabel.getX(), myLabel.getY() - 10);
            case (68) -> myLabel.setLocation(myLabel.getX() + 10, myLabel.getY());
            case (83) -> myLabel.setLocation(myLabel.getX(), myLabel.getY() + 10);
            default -> throw new IllegalStateException("Unexpected value: " + e.getKeyChar());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

//        keyReleased - called whenenver a button is released

        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());
    }
}
