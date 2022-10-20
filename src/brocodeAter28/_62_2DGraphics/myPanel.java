package brocodeAter28._62_2DGraphics;

import javax.swing.*;
import java.awt.*;

public class myPanel extends JPanel {
    myPanel(){
        this.setPreferredSize(new Dimension(600,600));
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(5));
        g2d.setPaint(Color.RED);
        g2d.drawLine(0,0,600,600);

        g2d.setPaint(Color.GREEN);
        g2d.drawRect(10,10,100,100);
        g2d.fillRect(10,10,100,100);

        g2d.setPaint(Color.CYAN);
        g2d.drawOval(100,100,100,100);
        g2d.fillOval(100,100,100,100);

        g2d.setPaint(Color.RED);
        g2d.fillArc(210,210,100,100,0,180);
        g2d.drawArc(210,210,100,100,0,180);

        g2d.setPaint(Color.CYAN);
        g2d.fillArc(210,210,100,100,180,180);
        g2d.drawArc(210,210,100,100,180,180);

        g2d.setPaint(Color.pink);

        int[] xPoints={250,350,450};
        int[] yPoints={400,200,400};
        g2d.fillPolygon(xPoints,yPoints,3);

        g2d.setFont(new Font("Helvetica", Font.BOLD, 20));// never set x and y position to 0,0 as drawstring starts from bottom left so it'll be hidden
        g2d.drawString("some common functions of g2d",0,500);

    }

}
