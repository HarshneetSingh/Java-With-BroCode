package brocodeAter28._62_2DGraphics;

import javax.swing.*;

public class myFrame extends JFrame {
    myPanel mPanel;

    myFrame(){
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mPanel = new myPanel();
        this.add(mPanel);
        this.pack();
        this.setVisible(true);
    }
}
