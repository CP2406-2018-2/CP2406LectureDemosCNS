import model.Sum;
import view.GestureListener;
import view.QuickSumFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The controller for the app
// looks after the overall application logic
public class Main {
    public static void main(String[] args) {

        // setup the model and view objects
        Sum sum = new Sum();
        QuickSumFrame quickSumFrame = new QuickSumFrame();

        // app logic for buttons
        quickSumFrame.addButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                int amount = Integer.parseInt(event.getActionCommand());

                sum.increment(amount);

                quickSumFrame.updateDisplay(sum.getValue());
            }
        });

        // app logic for reset menu item
        quickSumFrame.addResetListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum.reset();
                quickSumFrame.updateDisplay(sum.getValue());
            }
        });

        // app logic for swipe gesture
        quickSumFrame.addGestureListener(new GestureListener() {
            @Override
            public void swipedLeft() {
                sum.reset();
                quickSumFrame.updateDisplay(sum.getValue());
            }
        });

        quickSumFrame.setVisible(true);
    }
}
