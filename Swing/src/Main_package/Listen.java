package Main_package;

import javax.swing.*;
import java.awt.*;

public class Listen extends JPanel{
    public void paintComponent(Graphics g){

        int a = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        int c = (int) (Math.random() * 255);

        Color color = new Color(a,b,c);
        g.setColor(color);
        g.fillRect(50,50, 100,100);
    }
}
