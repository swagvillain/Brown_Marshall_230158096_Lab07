package lab7q1;

import javax.swing.*;
import java.awt.*;

public class View {
    public void makeFrame(){
        JFrame myFrame = new JFrame("Taschenrechner");
        myFrame.setSize(250, 400);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());




    }
}
