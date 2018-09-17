import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demos {
    public static void main(String[] args) {

        // JTextField - editable

        // multi-source event-driven programming

        // JCheckBox, ButtonGroup, ItemEvent

        // JComboBox

        // JScrollPane
        // ScrollPaneConstants

        // jframe is complex
        // root pane, menu bar
        // content pane, glass pane
        // add() method adds to content pane

        // various events - keyboard, mouse, window
        // using adaptor classes

        // menu bar, menu items
        // JMenuBar, JMenu, JMenuItem
        // JCheckBoxMenuItem, JRadioButtonMenuItem
        // setbackground - requires getContentPane

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.BLUE);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu file = new JMenu("file");
        menuBar.add(file);

        JMenuItem open = new JMenuItem("open");
        JMenuItem exit = new JMenuItem("exit");
        file.add(open);
        file.add(exit);

        JMenu settings = new JMenu("settings");
        JMenuItem blue = new JCheckBoxMenuItem("set blue");
        JMenuItem green = new JCheckBoxMenuItem("set green");
        settings.add(blue);
        settings.add(green);

        // controller / mediator
        ButtonGroup group = new ButtonGroup();
        group.add(blue);
        group.add(green);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
                Color color;
                switch (e.getActionCommand()) {
                    case "set green":
                        color = Color.GREEN;
                        break;
                    case "set blue":
                        color = Color.BLUE;
                        break;
                    default:
                        color = Color.GRAY;
                }
                frame.getContentPane().setBackground(color);
            }
        };

        blue.addActionListener(listener);
        green.addActionListener(listener);

        file.add(settings);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);

    }
}
