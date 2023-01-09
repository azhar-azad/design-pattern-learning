package books.head_first_design_patterns._02_observer.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Don't do it, you might regret it!");
    }
}
