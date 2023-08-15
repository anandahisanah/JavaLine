package main;

import java.awt.Color;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("UTS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LineJPanel lineJPanel = new LineJPanel();
        lineJPanel.setBackground(Color.WHITE);
        frame.add(lineJPanel);
        frame.setSize(750, 500);
        frame.setVisible(true);
    }
}
