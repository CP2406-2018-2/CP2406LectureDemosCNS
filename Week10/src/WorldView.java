import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorldView extends JPanel
        implements ActionListener {

    private Timer timer;
    private PacPeople people;

    public WorldView() {
        super();



        timer = new Timer(24, this);
        timer.start();
        setPreferredSize(new Dimension(600, 400));
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.setFont(new Font("Comic Sans MS", Font.BOLD, 24));

        for (Pacman pacman : people.all()) {
            graphics.setColor(pacman.color);
            graphics.fillOval(pacman.x, pacman.y, pacman.size, pacman.size);
            graphics.drawString("hello world", pacman.x, pacman.y);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int width = getWidth();
        int height = getHeight();
        people.move(width, height);
        repaint();
    }

    public void setModel(PacPeople people) {
        this.people = people;
    }

    public void toggleTimer() {
        if (timer.isRunning()) {
            timer.stop();
        } else {
            timer.start();
        }
    }
}
