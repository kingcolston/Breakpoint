package breakpoint.main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Setup{
    public JFrame frame;
    public void startScreen(){
        frame = new JFrame("Breakpoint");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500);
        //frame.setLayout(new FlowLayout());
        setUpMenu();

        //Creating the panel at bottom and adding components
        JPanel username = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Set Time: ");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        username.add(label); // Components Added using Flow Layout
        username.add(tf);

        JPanel password = new JPanel(); // the panel is not visible in output
        JLabel labelPassword = new JLabel("Password");
        JTextField tfPassword = new JTextField(10); // accepts upto 10 characters
        password.add(labelPassword); // Components Added using Flow Layout
        password.add(tfPassword);

        JButton reset = new JButton("Reset");
        JButton send = new JButton("Send");

        //Middle

        Panel middleGridBagLayout = new Panel();
        Panel middleTextPanel = new Panel();
        /*JLabel introInfoPanel = new JLabel(
                "<html>" +
                        "<div style = \"background-color: #ADD8E6; margin: 20px; min-width: 100vh\">" +
                        "<h1 style = \"text-align: center\">" +
                        "Breakpoint" +
                        "</h1>" +
                        "<p style = \"text-align: center; padding: 10px 30px; display: flex; flex-wrap: wrap\">" +
                        "Welcome to our humble abode. I hope you have a good time here and get lots of work done. Select preferences below." +
                        "</p>" +
                        "</div>" +
                        "</html>");*/
        //tf.setSize(5,5);
        JPanel introInfoPanel = new JPanel();
        introInfoPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbcHeader = new GridBagConstraints();
        gbcHeader.fill = GridBagConstraints.HORIZONTAL;
        gbcHeader.weightx = 1;
        gbcHeader.gridx = 0;
        gbcHeader.gridy = 0;

        JLabel header = new JLabel("Breakpoint");
        header.setFont(new Font("Times", Font.BOLD, 30));
        header.setHorizontalAlignment(SwingConstants.CENTER);
        introInfoPanel.add(header, gbcHeader);

        gbcHeader.gridy = 1;
        middleGridBagLayout.add(new Panel(), gbcHeader);

        JTextArea description = new JTextArea("Welcome the Breakpoint. The best way to stay focused is to take breaks. Set time interval below.");
        description.setLineWrap(true);
        description.setWrapStyleWord(true);
        description.setAlignmentY(Component.CENTER_ALIGNMENT);
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        description.setEditable(false);
        description.setBackground(null);
        description.setFont(new Font("Times", Font.PLAIN, 15));
        gbcHeader.gridy = 2;
        introInfoPanel.add(description, gbcHeader);

        middleGridBagLayout.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;

        middleGridBagLayout.add(new Panel(), gbc);
        gbc.gridx = 2;
        middleGridBagLayout.add(new Panel(), gbc);

        gbc.gridx = 1;
        middleGridBagLayout.add(introInfoPanel, gbc);

        gbc.weightx = 0.5;
        gbc.gridy = 1;
        middleGridBagLayout.add(username, gbc);

        gbc.gridy = 2;
        //middleGridBagLayout.add(password, gbc);

        Panel buttonsPanel = new Panel();
        buttonsPanel.add(send);
        buttonsPanel.add(reset);

        //gbc.gridy = 3;
        middleGridBagLayout.add(buttonsPanel, gbc);

        /*gbc.gridy = 4;
        JButton next = new JButton("Next");
        middleGridBagLayout.add(next, gbc);*/

        //next.addActionListener(e -> optionsScreen());

        //Adding Components to the frame.
        //frame.getContentPane().add(BorderLayout.SOUTH, panel);
        //frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, middleGridBagLayout);
        frame.setVisible(true);

    }

    public void optionsScreen(){
        frame.getContentPane().removeAll();
        frame.repaint();

        setUpMenu();

        Panel middleGridBagLayout = new Panel();
        middleGridBagLayout.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;


        Panel checkBoxGrid = new Panel();
        //checkBoxGrid.setLayout(new BoxLayout());

        frame.setVisible(true);
    }

    public void setUpMenu(){
        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
    }

}
