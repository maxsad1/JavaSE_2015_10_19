package edu.javacourse.inter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class FirstClass extends JButton implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("FirstClass:" + this.hashCode());
    }
}
