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
        Font font = new Font("Comic Sans MS", Font.PLAIN, 13);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(500, 400);

        // Set the background color of the frame
        frame1.getContentPane().setBackground(new Color(204, 255, 204)); // pastel green

        // Create the label, text field and buttons
        JLabel label = new JLabel("Pick a Game Mode:",SwingConstants.CENTER);
        label.setFont(font);
        JButton button1 = new JButton("Easy Peasy Mode");
        JButton button2 = new JButton("Challenge Mode (with timer)");
        button1.setFont(font);
        button2.setFont(font);

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
        // Create the second frame (Easy Mode)
        JFrame frame2 = new JFrame("Easy Mode");
        Font font = new Font("Comic Sans MS", Font.PLAIN, 13);
        frame2.getContentPane().setBackground(new Color(204, 255, 204)); // pastel green
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(500, 400);

        // Create labels, text fields, and buttons for the quiz
        JLabel questionLabel = new JLabel("Question 1:");
        questionLabel.setFont(font);
        JLabel answerLabel = new JLabel("Answer:");
        answerLabel.setFont(font);
        JButton button1 = new JButton("Option 1");
        button1.setFont(font);
        JButton button2 = new JButton("Option 2");
        button2.setFont(font);
        JButton button3 = new JButton("Option 3");
        button3.setFont(font);
        JButton button4 = new JButton("Option 4");
        button4.setFont(font);

        // Create an action listener for the buttons
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check the user's answer and update the game state
                // For example, you can display the result and show the next question
            }
        };

        // Add the action listener to the buttons
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);

        // Set the size and background color of the components
        questionLabel.setOpaque(true); 
        questionLabel.setBackground(Color.YELLOW); 
        answerLabel.setOpaque(true); 
        answerLabel.setBackground(Color.YELLOW); 
        button1.setOpaque(true); 
        button1.setBackground(Color.PINK); 
        button2.setOpaque(true); 
        button2.setBackground(Color.PINK); 
        button3.setOpaque(true); 
        button3.setBackground(Color.PINK); 
        button4.setOpaque(true); 
        button4.setBackground(Color.PINK);

        // Create a GridBagConstraints object to specify the layout constraints
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(10, 10, 10, 10); // add some spacing around the components

        // Add the components to the second frame using GridBagLayout
        frame2.getContentPane().setLayout(new GridBagLayout());
        frame2.getContentPane().add(questionLabel, constraints);

        constraints.gridy = 1;
        frame2.getContentPane().add(answerLabel, constraints);

        constraints.gridy = 2;
        frame2.getContentPane().add(button1, constraints);

        constraints.gridy = 3;
        frame2.getContentPane().add(button2, constraints);

        constraints.gridy = 4;
        frame2.getContentPane().add(button3, constraints);

        constraints.gridy = 5;
        frame2.getContentPane().add(button4, constraints);

        return frame2;
    }
private static JFrame createFrame3() {
    // Create Frame 3
    JFrame frame3 = new JFrame("Frame 3: Quiz");
    Font font = new Font("Comic Sans MS", Font.PLAIN, 13);
    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame3.setSize(500, 400);

    // Set the background color of the frame
    frame3.getContentPane().setBackground(new Color(255, 204, 204)); // pastel pink

    // Create a label and a button for the quiz
    JLabel quizLabel = new JLabel("Question 1: What is the capital of France?", SwingConstants.CENTER);
    quizLabel.setFont(font);
    JButton option1Button = new JButton("Paris");
    JButton option2Button = new JButton("London");
    JButton option3Button = new JButton("Berlin");
    JButton option4Button = new JButton("Rome");
    JLabel timerLabel = new JLabel("Time left: 10", SwingConstants.CENTER);
    timerLabel.setFont(font);

    // Create an action listener for the start quiz button
    ActionListener actionListener = new ActionListener() {
        int timeLeft = 10; // 30 seconds timer

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == option1Button || e.getSource() == option2Button || e.getSource() == option3Button || e.getSource() == option4Button) {
                // Check the answer and show Frame 4 when the time is up
                if (timeLeft > 0) {
                    timeLeft--;
                    timerLabel.setText("Time left: " + timeLeft);
                } else {
                    JFrame frame4 = createFrame4();
                    frame4.setVisible(true);
                    frame3.dispose(); // close the current frame
                }
            }
        }
    };

    // Add the action listener to the option buttons
    option1Button.addActionListener(actionListener);
    option2Button.addActionListener(actionListener);
    option3Button.addActionListener(actionListener);
    option4Button.addActionListener(actionListener);

    // Set the size and background color of the components
    quizLabel.setOpaque(true);
    quizLabel.setBackground(Color.CYAN);
    option1Button.setOpaque(true);
    option1Button.setBackground(Color.ORANGE);
    option2Button.setOpaque(true);
    option2Button.setBackground(Color.ORANGE);
    option3Button.setOpaque(true);
    option3Button.setBackground(Color.ORANGE);
    option4Button.setOpaque(true);
    option4Button.setBackground(Color.ORANGE);
    timerLabel.setOpaque(true);
    timerLabel.setBackground(Color.YELLOW);

    // Create a GridBagConstraints object to specify the layout constraints
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.insets = new Insets(10, 10, 10, 10); // add some spacing around the components

    // Add the components to Frame 3 using GridBagLayout
    frame3.getContentPane().setLayout(new GridBagLayout());
    frame3.getContentPane().add(quizLabel, constraints);

    constraints.gridy = 1;
    frame3.getContentPane().add(option1Button, constraints);

    constraints.gridy = 2;
    frame3.getContentPane().add(option2Button, constraints);

    constraints.gridy = 3;
    frame3.getContentPane().add(option3Button, constraints);

    constraints.gridy = 4;
    frame3.getContentPane().add(option4Button, constraints);

    constraints.gridy = 5;
    frame3.getContentPane().add(timerLabel, constraints);

    // Start the timer when Frame 3 is opened
    Timer timer = new Timer(1000, new ActionListener() {
    int timeLeft = 10 ;
        @Override
        public void actionPerformed(ActionEvent e) {
            if (timeLeft > 0) {
                timeLeft--;
                timerLabel.setText("Time left: " + timeLeft);
            } else {
                Timer timer = (Timer) e.getSource();
                timer.stop();
                JFrame frame4 = createFrame4();
                frame4.setVisible(true);
                frame3.dispose(); // close the current frame
            }
        }
    });
    timer.start();

    return frame3;
}



// private static void startTimer(JFrame frame, int seconds) {
//     // Implement a timer for Frame 3
//     // You can use a Swing Timer to update the timerLabel every second
// }

private static JFrame createFrame4() {
    // Create Frame 4
    JFrame frame4 = new JFrame("Frame 4: Time's Up!");
    Font font = new Font("Comic Sans MS", Font.PLAIN, 13);
    frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame4.setSize(500, 400);

    // Set the background color of the frame
    frame4.getContentPane().setBackground(new Color(204, 255, 204)); // pastel green

    // Create labels and buttons for the time's up message and returning to the quiz
    JLabel timeUpLabel = new JLabel("Time's Up!", SwingConstants.CENTER);
    timeUpLabel.setFont(font);
    JButton returnToQuizButton = new JButton("Return to Quiz");
    returnToQuizButton.setFont(font);

    // Create an action listener for the return button
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == returnToQuizButton) {
                // Create and show Frame 3 when the return button is pressed
                JFrame frame3 = createFrame3();
                frame3.setVisible(true);
                frame4.dispose(); // close the current frame
            }
        }
    };

    // Add the action listener to the return button
    returnToQuizButton.addActionListener(actionListener);

    // Set the size and background color of the components
    timeUpLabel.setOpaque(true);
    timeUpLabel.setBackground(Color.YELLOW);
    returnToQuizButton.setOpaque(true);
    returnToQuizButton.setBackground(Color.PINK);

    // Create a GridBagConstraints object to specify the layout constraints
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.insets = new Insets(10, 10, 10, 10); // add some spacing around the components

    // Add the components to Frame 4 using GridBagLayout
    frame4.getContentPane().setLayout(new GridBagLayout());
    frame4.getContentPane().add(timeUpLabel, constraints);

    constraints.gridy = 1;
    frame4.getContentPane().add(returnToQuizButton, constraints);

    return frame4;
}


}
