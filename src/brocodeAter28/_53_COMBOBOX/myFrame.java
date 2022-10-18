package brocodeAter28._53_COMBOBOX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {
//    jcombo box takes an arr of strings or if you want to input int or double arr then go with wrapper classes
//     as it make primitive to objects

    JComboBox myComboBox;
    myFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250,250);
        setLayout(null);

//      Integer[] arr = {1,2,3};       you can d this by this only

        String[] arr={"dog","cat","bird"};

        myComboBox = new JComboBox(arr);
        myComboBox.addActionListener(this);
        myComboBox.setBounds(50,50,100,50);
//      myComboBox.setEditable(true);     helps you to add by editing
//        System.out.println(myComboBox.getItemCount());    ttl number of items
//        .addItem("jer");   will add the item
//        .removeItem("jer"); will remove the item
//        .removeAllItem("jer"); will remove all  the item
//        .insertItemAt(
//        myComboBox.getItemAt(0);  WILL GIVE YOU THE ITE,
        this.add(myComboBox);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myComboBox){
            System.out.println(myComboBox.getSelectedItem());
//            you can also get the index of the selected ones by using , getSelectedIndex() method
        }
    }
}
