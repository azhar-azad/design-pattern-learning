package books.head_first_design_patterns._02_observer.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevilListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Come on, do it!");
    }
}
