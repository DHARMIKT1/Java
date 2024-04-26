import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Action Listener Example");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me");

        // Create an ActionListener
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action to perform when the button is clicked
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        };

        // Add the ActionListener to the button
        button.addActionListener(actionListener);

        // Add button to panel
        panel.add(button);

        // Add panel to frame
        frame.add(panel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
