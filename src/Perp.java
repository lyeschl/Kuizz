import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Perp {
    public Perp(){
        JFrame frame = new JFrame("Math Quiz Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
 
        JLabel questionLabel = new JLabel();
        frame.add(questionLabel, BorderLayout.NORTH);

        JTextField answerField = new JTextField(10);
        frame.add(answerField, BorderLayout.CENTER);

        JButton submitButton = new JButton("Submit");
        frame.add(submitButton, BorderLayout.SOUTH);

        JLabel scoreLabel = new JLabel();
        frame.add(scoreLabel, BorderLayout.EAST);

        JLabel timeLabel = new JLabel();
        frame.add(timeLabel, BorderLayout.WEST);

        // Timer for hard mode
        int timeLeft = 60; // 60 seconds
        Timer timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            timeLeft--;
            timeLabel.setText("Time Left: " + timeLeft);
            if (timeLeft <= 0) {
                timer.stop();
                JOptionPane.showMessageDialog(frame, "Time's up! Your score is " + score);
                frame.dispose();
            }
        int score = 0;
        Random rand = new Random();
                
        // Easy mode
        JButton easyModeButton = new JButton("Easy Mode");
        frame.add(easyModeButton, BorderLayout.SOUTH);
                
        easyModeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                questionLabel.setText("What is " + rand.nextInt(10) + " + " + rand.nextInt(10) + "?");
                String answer = JOptionPane.showInputDialog(frame, "Enter your answer");
                int correctAnswer = rand.nextInt(10) + rand.nextInt(10);
                if (Integer.parseInt(answer) == correctAnswer) {
                    score++;
                    JOptionPane.showMessageDialog(frame, "Correct! Your score is " + score);
                } else {
                    JOptionPane.showMessageDialog(frame, "Incorrect. The correct answer is " + correctAnswer + ". Your score is " + score);
                }
            }
        });

    // Hard mode
    JButton hardModeButton = new JButton("Hard Mode");
    frame.add(hardModeButton, BorderLayout.SOUTH);

    hardModeButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            questionLabel.setText("What is " + rand.nextInt(100) + " * " + rand.nextInt(10) + "?");
            String answer = JOptionPane.showInputDialog(frame, "Enter your answer");
            int correctAnswer = rand.nextInt(100) * rand.nextInt(10);
            if (Integer.parseInt(answer) == correctAnswer) {
                score++;
                JOptionPane.showMessageDialog(frame, "Correct! Your score is " + score);
            } else {
                JOptionPane.showMessageDialog(frame, "Incorrect. The correct answer is " + correctAnswer + ". Your score is " + score);
            }
            timer.start();
        }
    });

    // Submit button
    submitButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String answer = answerField.getText();
            int correctAnswer = Integer.parseInt(questionLabel.getText().split(" ")[0]);
            if (Integer.parseInt(answer) == correctAnswer) {
                score++;
                JOptionPane.showMessageDialog(frame, "Correct! Your score is " + score);
                answerField.setText("");
                questionLabel.setText(generateQuestion());
            } else {
                JOptionPane.showMessageDialog(frame, "Incorrect. The correct answer is " + correctAnswer + ". Your score is " + score);
                answerField.setText("");
            }
        }
    });

    // Generate a random math problem
    String generateQuestion() {
        Random rand;
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(10);
        int operation = rand.nextInt(4);
        int correctAnswer = 0;
        String question = "" ;
        if (operation == 0) {
            correctAnswer = num1 + num2;
            question = num1 + " + " + num2;
        } else if (operation == 1) {
            correctAnswer = num1 - num2;
            question = num1 + " - " + num2;
        } else if (operation == 2) {
            correctAnswer = num1 * num2;
            question = num1 + " * " + num2;
        } else if (operation == 3) {
            correctAnswer = num1 / num2;
            question = num1 + " / " + num2;
        }
        return question;
    }
    
    });

    }
    public static void main(String[] args) throws Exception {
        new Perp();
    }
}
