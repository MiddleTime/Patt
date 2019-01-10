package Observer3;

import javax.swing.*;
import java.awt.*;

public class DataTest2 {

    JFrame frame;

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Can I press this button ???");

        //   With lambdas
        button.addActionListener(event
                -> System.out.println("Don't do it, you might regret it!")
        );
        button.addActionListener(event
                -> System.out.println("Come on, do it!")
        );
        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
