import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        PacPeople people = new PacPeople(10);

        WorldView worldView = new WorldView();
        worldView.setModel(people);

        JButton button = new JButton("okay");
        worldView.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                worldView.toggleTimer();
            }
        });

        frame.add(worldView);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
