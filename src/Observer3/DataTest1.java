package Observer3;

import javax.swing.*;
import java.awt.*;

public class DataTest1 {

    JFrame frame;

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Можно я нажму эту кнопку???");

        button.addActionListener(new FirstListener());
        button.addActionListener(new SecondListener());

        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

}
