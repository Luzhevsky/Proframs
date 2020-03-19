package Main_package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener{

    JButton button2;
    JButton button;
    JFrame frame;

    public class Button_Repair{

    }
    public void actionPerformed(ActionEvent event){
        button.setText("hello");
        frame.repaint();
    }


    public void go(){
        frame = new JFrame();
        button = new JButton("button");
        button2 = new JButton("button2");

        Listen draw = new Listen();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.getContentPane().add(BorderLayout.CENTER, draw);
        frame.getContentPane().add(BorderLayout.EAST, button2);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        button.addActionListener(this);

        frame.setSize(400,400);
        frame.setVisible(true);
    }

    public static void main(String[] args){
       Main main = new Main();
       main.go();

    }
}
