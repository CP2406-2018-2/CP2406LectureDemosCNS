import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame
        extends JFrame implements ActionListener {

    private int sum;
    private JLabel sumLabel;

    public MainFrame() {
        super("Quick sum");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // general structure setup - create label and sub-panel
        JPanel centerPanel = new JPanel();
        sumLabel = new JLabel("0");

        // add GUI elements to the frame - adjust panel to use a 3x3 grid layout
        add(sumLabel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new GridLayout(3,3));

        // adjust font size for the label
        Font font = new Font("Arial", Font.BOLD, 42);
        sumLabel.setFont(font);

        // setup buttons and link them all to the same callback code

        for (int i = 0; i < 9; ++i) {
            JButton button = new JButton("" + (i+1));
            button.setFont(font);
            centerPanel.add(button);
            button.addActionListener(this);
        }

        pack(); // fit the frame around the GUI elements it contains
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // this is the button click event handler - aka a "callback"
        System.out.println(e.getActionCommand());

        String label = e.getActionCommand();
        int value = Integer.parseInt(label);
        sum += value;

        sumLabel.setText("" + sum);
    }
}
