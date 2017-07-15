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
    public static GraphicsDevice graphic_device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    public static int width = graphic_device.getDisplayMode().getWidth(), height = graphic_device.getDisplayMode().getHeight();

    public static void main(String[] args) {
        window_start_screen_();
    }

   public static void window_start_screen_(){
        JFrame win_start_screen = new JFrame("Start");

        JButton sample_button = new JButton("New Project");
        sample_button.setSize(100,100);
        sample_button.setBackground(Color.black);

        JPanel win_start_sheet = new JPanel(new BorderLayout(24,24));
        JPanel win_side_menu = new JPanel(new FlowLayout(24,24,24));
        JPanel win_top_bar = new JPanel(new CardLayout(24,24));
        JPanel win_center_options = new JPanel(new GridLayout(6,6,6,6));

        win_start_screen.setSize(width-100,height-100);
        win_start_screen.setLocation(50,20);
        win_start_sheet.setBackground(Color.getHSBColor(40f, 33f, 10f));
        win_side_menu.setBackground(Color.getHSBColor(55f, 179f, 16f));
        win_top_bar.setBackground(Color.getHSBColor(255, 179, 1));
        win_center_options.setBackground(Color.yellow);

        win_start_screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win_start_screen.getContentPane().add(win_start_sheet);
        win_start_screen.add(win_side_menu, BorderLayout.WEST);
        win_start_screen.add(win_top_bar, BorderLayout.NORTH);
        win_start_screen.add(win_center_options, BorderLayout.CENTER);

        win_center_options.add(sample_button);


        win_start_screen.setVisible(true);
    }

}
