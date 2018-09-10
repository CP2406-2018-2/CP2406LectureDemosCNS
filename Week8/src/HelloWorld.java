import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    public static void main(String[] args) {

        // basic "hello world" example

        JFrame frame = new JFrame("hello world");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when the frame is closed the program ends

        // apparently these don't work??? :)
        frame.setBackground(Color.GREEN);
        frame.setForeground(Color.BLUE);

        // set the layout for the frame to be  1x2 grid
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(1,2));

        JButton okayButton = new JButton("okay");

        // this is showing the "syntactic sugar" for an "anonymous inner class"
        okayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I'm blue da ba de da ba de");
                JFrame newFrame = new JFrame("new frame");

                newFrame.setSize(new Dimension(320,160));
                newFrame.setVisible(true);
            }
        });

        frame.add(okayButton);

        JButton cancelButton = new JButton("cancel");
        frame.add(cancelButton);

        // we also added an anonymous inner class to the cancel button
        // each button has it's own event handling code...
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
