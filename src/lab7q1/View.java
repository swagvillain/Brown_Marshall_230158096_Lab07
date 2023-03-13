package lab7q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class View {
    static JFrame myFrame = new JFrame("Taschenrechner");
    public void makeFrame(){
        //JFrame myFrame = new JFrame("Taschenrechner");
        myFrame.setSize(400, 500);
        myFrame.setResizable(false);
        myFrame.setLayout(new BorderLayout());
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(4, 3));
        buttonsPanel.setPreferredSize(new Dimension(400, 400));
        myFrame.add(buttonsPanel, BorderLayout.CENTER);
        makeButtons(buttonsPanel);

        JPanel displayPanel = new JPanel();
        displayPanel.setPreferredSize(new Dimension(400,100));
        displayPanel.setSize(new Dimension(550, 200));
        makeDisplay(displayPanel);
        myFrame.add(displayPanel, BorderLayout.NORTH);
        myFrame.setVisible(true);
    }

    private void makeButtons(JPanel panel){
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bClear = new JButton("Clear");
        JButton bNeg = new JButton("-");

        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b0);
        panel.add(bClear);
        panel.add(bNeg);

        bClear.addActionListener((ae)-> Register.myRegister.clearDisplay());
        bNeg.addActionListener((ae)-> Register.myRegister.negate());
        b0.addActionListener((ae)-> Register.myRegister.addDigit(0));
        b1.addActionListener((ae)-> Register.myRegister.addDigit(1));
        b2.addActionListener((ae)-> Register.myRegister.addDigit(2));
        b3.addActionListener((ae)-> Register.myRegister.addDigit(3));
        b4.addActionListener((ae)-> Register.myRegister.addDigit(4));
        b5.addActionListener((ae)-> Register.myRegister.addDigit(5));
        b6.addActionListener((ae)-> Register.myRegister.addDigit(6));
        b7.addActionListener((ae)-> Register.myRegister.addDigit(7));
        b8.addActionListener((ae)-> Register.myRegister.addDigit(8));
        b9.addActionListener((ae)-> Register.myRegister.addDigit(9));
    };

    private void makeDisplay(JPanel displayPanel){
        JTextField display = new JTextField(Register.myRegister.getDisplayText());
        display.setFont(new Font("Menlo", Font.BOLD,30));
        display.setBackground(new Color(0xB00B1E));
        display.setForeground((new Color(0xBEEF)));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.TRAILING);
        display.setVisible(true);

        display.setPreferredSize(new Dimension(400, 150));

        displayPanel.add(display, BorderLayout.NORTH);

        display.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                Register.myRegister.clearDisplay();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });


    }
}
