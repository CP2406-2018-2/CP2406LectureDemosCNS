package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


// This class looks after view layout and view logic
public class QuickSumFrame extends JFrame {

    private JLabel sumLabel;
    private JPanel centerPanel;
    private Font font;
    private JMenuItem resetMenuItem;

    private GestureListener gestureListener;
    private int startX;

    public QuickSumFrame() {
        super("Quick sum");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setupLayout();
        setupFont();
        setupButtons();
        setupMenu();
        setupGesture();

        setFocusable(true);
        pack(); // fit the frame around the GUI elements it contains
    }

    private void setupGesture() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent event) {
                System.out.println(event.getKeyCode());
                if (event.getKeyCode() == 27) {
                    System.exit(0);
                }
            }
        });

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                if (gestureListener == null) return;
                startX = event.getX();
            }

            @Override
            public void mouseReleased(MouseEvent event) {
                if (gestureListener == null) return;

                int endX = event.getX();
                if (endX < startX) {
                    gestureListener.swipedLeft();
                }
            }
        });
    }

    private void setupLayout() {
        // general structure setup - create label and sub-panel
        centerPanel = new JPanel();
        sumLabel = new JLabel("0");

        // add GUI elements to the frame - adjust panel to use a 3x3 grid layout
        add(sumLabel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new GridLayout(3,3));
    }

    private void setupFont() {
        // adjust font size for the label
        font = new Font("Arial", Font.BOLD, 42);
        sumLabel.setFont(font);
    }

    private void setupButtons() {
        // setup buttons and link them all to the same callback code
        for (int i = 0; i < 9; ++i) {
            JButton button = new JButton("" + (i+1));
            button.setFont(font);
            centerPanel.add(button);
            //button.addActionListener(this);
        }
    }

    private void setupMenu() {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu settings = new JMenu("settings");
        menuBar.add(settings);

        resetMenuItem = new JMenuItem("reset");
        settings.add(resetMenuItem);
    }

    public void addResetListener(ActionListener listener) {
        resetMenuItem.addActionListener(listener);
    }

    public void addButtonListener(ActionListener listener) {
        Component[] components = centerPanel.getComponents();

        for (Component component : components) {
            JButton button = (JButton) component; // downcast
            button.addActionListener(listener);
        }
    }

    public void addGestureListener(GestureListener listener) {
        gestureListener = listener;
    }

    public void updateDisplay(int value) {
        sumLabel.setText("" + value);
    }
}
