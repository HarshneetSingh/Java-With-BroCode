package brocodeAter28._49_JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        JOptionPane = POP UP standard dialog box that prompts users for a value or informs them of something;

/*
        IT IS TO SHOW SOME MESSAGES         SHOW MESSAGE DIALOG

        JOptionPane.showMessageDialog(null,"what's up?","Hershey's",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"what's up?","Hershey's",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"what's up?","Hershey's",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"what's up?","Hershey's",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"what's up?","Hershey's", JOptionPane.QUESTION_MESSAGE);
*/

/*
        IT IS TO ASK SOMETHING FROM USER                           SHOW CONFIRM DIALOG

        RETURN of JOptionPane.YES_NO_CANCEL_OPTION RETURNS int value

        YES=0
        NO=1
        CANCEL=2

        int answer = JOptionPane.showConfirmDialog(null, "bro do you code", "harshi asking", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        System.out.println(answer);
*/

/*

        to get something from user in string format


        String answer =  JOptionPane.showInputDialog("what's up?");

        System.out.println(answer);
*/

//        ALL IN one for asking no or yes answer


        String[] response={"haan", "nahi", "pta nahi"};


        int answer= JOptionPane.showOptionDialog(null,
                "bro do you code",
                "harshi asking",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon("src/yo.png"),
                response,
                2);


        System.out.println(answer);
    }
}
