package com.variable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by benja on 7/14/2017.
 */
public class front_end_ {
    public static void main(String[] args) {
        GraphicsDevice graphic_device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = graphic_device.getDisplayMode().getWidth();
        int height = graphic_device.getDisplayMode().getHeight();
        JFrame start_screen_ = new JFrame("Initializer Screen");
        JPanel screen_sheet = new JPanel(new BorderLayout());
        JButton logBTN = new JButton("Sign in");
        logBTN.setSize(300,300);
        start_screen_.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        start_screen_.getContentPane().add(screen_sheet, BorderLayout.CENTER);
        start_screen_.setSize(width/3,height/2);
        start_screen_.setLocation(width/3,height/3);

        screen_sheet.add(logBTN);

        start_screen_.setVisible(true);
    }
}
