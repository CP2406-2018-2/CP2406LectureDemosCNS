import java.awt.*;
import java.util.Random;

public class Pacman {
    int x,y;
    int xDir, yDir;
    int xSpeed, ySpeed;
    int size;
    int red = random.nextInt(256);
    int green = random.nextInt(256);
    int blue = random.nextInt(256);
    Color color = new Color(red, green, blue);
    private static Random random = new Random();


    public Pacman() {
        xDir = 1 + random.nextInt(10);
        yDir = 1 + random.nextInt(10);
        xSpeed = ySpeed = 1;
        size = 5 + random.nextInt(10);
    }

    public void move(int width, int height) {
        x += xDir * xSpeed;
        y += yDir * ySpeed;

        if ((x <= 0 && xDir < 0)
                || (x + size >= width && xDir > 0)) {
            xSpeed = 1 + random.nextInt(5);
            xDir *= -1;
            size = 5 + random.nextInt(10);
        }

        if (y <= 0 && yDir < 0) {
            yDir = 1;
            size = 5 + random.nextInt(10);
            ySpeed = 1 + random.nextInt(5);
        } else if (y + size >= height && yDir > 0) {
            yDir = -1;
            size = 5 + random.nextInt(10);
            ySpeed = 1 + random.nextInt(5);
        }
    }
}
