package books.head_first_design_patterns._02_observer.swing;

import javax.swing.*;
import java.awt.*;

/***
 * Simple Swing application that just creates a frame
 * and throws a button in it.
 */
public class SwingObserverExample {

    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        // Without lambdas
//        button.addActionListener(new AngelListener());
//        button.addActionListener(new DevilListener());

        // With lambdas
        button.addActionListener(event -> System.out.println("Don't do it, you may regret it!"));
        button.addActionListener(event -> System.out.println("Come on, do it!"));

        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
