package breakpoint.main.alerts;

import breakpoint.main.fetchJoke;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AlertUI {
    public JFrame frame;
    public void popUp(String alert){
        if (frame == null) frame = new JFrame("BREAKPOINT ALERT!!");
        frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        frame.setSize(300,200);
        JTextArea alertArea = new JTextArea(alert);
        alertArea.setLineWrap(true);
        alertArea.setWrapStyleWord(true);
        alertArea.setEditable(false);
        alertArea.setFont(new Font("Times", Font.BOLD, 20));
        alertArea.setLayout(new FlowLayout());

        JButton jokeButton = new JButton("Get Joke!");
        jokeButton.addActionListener(e -> jokePopUp(fetchJoke.getJoke()));

        frame.getContentPane().add(BorderLayout.CENTER, alertArea);
        frame.getContentPane().add(BorderLayout.SOUTH, jokeButton);

        Random rand = new Random();
        frame.setLocation(rand.nextInt((int) GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getWidth()), rand.nextInt((int) GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getHeight()));
        frame.setVisible(true);
    }
    public void jokePopUp(String alert){
        JFrame jokeFrame = new JFrame("BREAKPOINT ALERT!!");
        jokeFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        jokeFrame.setSize(300,200);
        JTextArea alertArea = new JTextArea(alert);
        alertArea.setLineWrap(true);
        alertArea.setWrapStyleWord(true);
        alertArea.setEditable(false);
        alertArea.setFont(new Font("Times", Font.BOLD, 20));
        alertArea.setLayout(new FlowLayout());

        JButton jokeButton = new JButton("Get Joke!");
        jokeButton.addActionListener(e -> jokePopUp(fetchJoke.getJoke()));

        jokeFrame.getContentPane().add(BorderLayout.CENTER, alertArea);
        jokeFrame.getContentPane().add(BorderLayout.SOUTH, jokeButton);

        Random rand = new Random();
        jokeFrame.setLocation(rand.nextInt((int) GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getWidth()), rand.nextInt((int) GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getHeight()));

        jokeFrame.setVisible(true);
    }


}
