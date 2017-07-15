/**
MIT License

Copyright (c) 2017 Benjaminlopez9

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

@author: Benjamin Lopez,
@email: Blopez24@asu.edu,
@project type: Machine Learning,
**/

import javax.swing.*;
import java.awt.*;

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
