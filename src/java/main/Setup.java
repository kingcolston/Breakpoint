import javax.swing.*;
import java.awt.*;

public class Setup {
    public JFrame frame;
    public void startScreen(){
        frame = new JFrame("Breakpoint");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(new FlowLayout());
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

        //Creating the panel at bottom and adding components
        JPanel username = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Username");
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

        Panel middleBox = new Panel();
        Panel middleTextPanel = new Panel();
        JLabel middle = new JLabel(
                "<html>" +
                        "<div style = \"background-color: #ADD8E6; margin: 20px\">" +
                        "<h1 style = \"text-align: center\">" +
                        "Breakpoint" +
                        "</h1>" +
                        "<p style = \"text-align: center; padding: 10px 30px; display: flex; flex-wrap: wrap\">" +
                        "Welcome to our humble abode. I hope you have a good time here and get lots of work done. Select preferences below." +
                        "</p>" +
                        "</div>" +
                        "</html>");
        //tf.setSize(5,5);

        middleBox.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;

        middleBox.add(middle, gbc);

        gbc.weightx = 0.5;
        gbc.gridy = 1;
        middleBox.add(username, gbc);

        gbc.gridy = 2;
        middleBox.add(password, gbc);

        gbc.gridy = 3;
        middleBox.add(send, gbc);
        gbc.gridx = 1;
        middleBox.add(reset, gbc);

        //Adding Components to the frame.
        //frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, middleBox);
        frame.setVisible(true);

    }
}
