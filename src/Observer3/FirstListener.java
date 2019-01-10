package Observer3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("О нет, не делай этого!!!");
    }
}
