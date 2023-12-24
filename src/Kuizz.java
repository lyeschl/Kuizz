import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kuizz {
    public static void main(String[] args) {
        // Create and show the first frame
        JFrame frame1 = createFrame1();
        frame1.setVisible(true);
    } 
    private static JFrame createFrame1() {
        // Create the first frame
        JFrame frame1 = new JFrame("Frame 1:");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(500, 400);

        // Set the background color of the frame
        frame1.getContentPane().setBackground(new Color(204, 255, 204)); // pastel green

        // Create the label, text field and buttons
        JLabel label = new JLabel("Pick a Game Mode:",SwingConstants.CENTER);
        JButton button1 = new JButton("Easy Peasy Mode");
        JButton button2 = new JButton("Challenge Mode (with timer)");

        // Create an action listener for the buttons
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1) {
                    // Create and show Frame 2 when button 1 is pressed
                    JFrame frame2 = createFrame2();
                    frame2.setVisible(true);
                    frame1.dispose(); // close the first frame
                } else if (e.getSource() == button2) {
                    // Create and show Frame 3 when button 2 is pressed
                    JFrame frame3 = createFrame3();
                    frame3.setVisible(true);
                    frame1.dispose(); // close the first frame
                }
            }
        };

    // Add the action listener to the buttons
    button1.addActionListener(actionListener);
    button2.addActionListener(actionListener);

    // Set the size of the buttons
    button1.setPreferredSize(new Dimension(150, 50));
    button2.setPreferredSize(new Dimension(200, 50));

    // Set the background color of the label and buttons
    label.setOpaque(true); 
    label.setBackground(Color.YELLOW); 
    button1.setBackground(Color.PINK); 
    button2.setBackground(Color.CYAN); 

    // Create a GridBagConstraints object to specify the layout constraints
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.insets = new Insets(10, 10, 10, 10); // add some spacing around the components

    // Add the label and buttons to the first frame using GridBagLayout
    frame1.getContentPane().setLayout(new GridBagLayout());
    frame1.getContentPane().add(label, constraints);

    constraints.gridy = 1;
    constraints.gridwidth = 1;
    frame1.getContentPane().add(button1, constraints);

    constraints.gridx = 1;
    frame1.getContentPane().add(button2, constraints);

    return frame1;
        }
    private static JFrame createFrame2() {
        // Create the second frame
        JFrame frame2 = new JFrame("Easy Mode");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(500, 400);
        return frame2;
    }
    private static JFrame createFrame3() {
        // Create the third frame
        JFrame frame3 = new JFrame("Hard Mode");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(500, 400);
        return frame3;
    }

}
