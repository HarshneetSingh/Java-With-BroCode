package brocodeAter28._57_selectAFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class myFrame extends JFrame implements ActionListener {
    JButton myButton;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);

        myButton = new JButton("Select a file");
        myButton.addActionListener(this);
        this.add(myButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == myButton) {
            JFileChooser chooser = new JFileChooser();

//            you can select current directory too ..

            chooser.setCurrentDirectory(new File("C:\\Users\\harsh\\OneDrive\\Desktop"));

//            int response = chooser.showOpenDialog(null);   //     it returns int value 0 is selected or saved , 1 if cancel of exit
            int response = chooser.showSaveDialog(null); // it returns int value 0 is selected or saved
            if (response == JFileChooser.APPROVE_OPTION) {
                try {
                    FileWriter writer = new FileWriter("C:\\Users\\harsh\\OneDrive\\Desktop\\"+chooser.getSelectedFile().getName());
                    writer.write("ez");
                    writer.close();
                    System.exit(0);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
