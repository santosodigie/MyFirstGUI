import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER); // adds the panel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what happens when they close the frame
        frame.setTitle("My GUI"); // set the title of the window
        frame.pack(); // set window to match a certain size
        frame.setVisible(true); //set the window to be visible and in focis
    }
    public static void main(String[] args) {
        new GUI();
    }
}
