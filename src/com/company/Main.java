package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JTextField field = new JTextField(5);
    JButton button = new JButton("Click me,pls");
    int count = 0;
    Main(){
        super("ПРиветики");
        setLayout(new FlowLayout());
        setSize(100,100);
        setLocation(new Point(400,400));
        add(field);
        add(button);
        int value = (int)(Math.random() * 21);
        System.out.println(value);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (count > 3){
                    JOptionPane.showMessageDialog(null,"Попытки исчезли!");
                }
                else {
                    // String numberS = field.getText();
                    int number = Integer.parseInt(field.getText());
                    if (value == number) {
                        JOptionPane.showMessageDialog(null, "Ты выиграл!");


                    }
                    else if (value>number){
                        JOptionPane.showMessageDialog(null, "Число блльше!");
                    }
                    else JOptionPane.showMessageDialog(null, "Число меньше!");
                }


            }
        });
        setVisible(true);
        setResizable(false);

    }




    public static void main(String[] args) {
        new Main();
    }
}
