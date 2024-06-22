package Main;

import View.Panel.MainPanel;

import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        MainPanel panel = new MainPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}
