import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// this is a pretty standard way of setting up a Swing GUI program
// you subtype JFrame and use the constructor to setup the GUI elements
// and the event handlers for the new instance

public class Spawner extends JFrame {

    static private Random random = new Random();

    public Spawner() {
        super("Spawner");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null); // center

        JButton button = new JButton("okay");
        add(button, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame spawner = new Spawner();
                spawner.setVisible(true);
            }
        });

        setSize(300,100);

        // get the screen size from the Toolkit SINGLETON object
        // adjust the location of the new frame based on it's size and the screen size
        // we set the location randomly within a 100 margin inside the screen
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = 100 + random.nextInt(screen.width - 100) - 300/2;
        int y = 100 + random.nextInt(screen.height - 100) - 100/2;
        setLocation(x,y);
    }
}
