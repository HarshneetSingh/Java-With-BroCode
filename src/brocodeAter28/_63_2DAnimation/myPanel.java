package brocodeAter28._63_2DAnimation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myPanel extends JPanel implements ActionListener {
    Image myImage;
    Timer myTimer;
    int frameWidth=600;
    int xVelocity=2;
int yVelocity = 1;
    int y=0;
    int x=0;

    myPanel(){
        this.setPreferredSize(new Dimension(600,600));
        this.setBackground(Color.black);
        this.setOpaque(true);
        myImage = new ImageIcon("src/yo.png").getImage();
        myTimer = new Timer(10,this);
        myTimer.start();
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(myImage,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(frameWidth - myImage.getWidth(null) <= x || x<0){
            xVelocity=xVelocity*-1;
        }
        x=x+xVelocity;
        if(frameWidth - myImage.getWidth(null) <= y|| y<0){
            yVelocity=yVelocity*-1;
        }
        y=y+yVelocity;

        repaint();
    }
}
