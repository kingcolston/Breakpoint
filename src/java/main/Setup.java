import javax.swing.*;
import java.awt.*;

public class Setup {
    public JFrame frame;
    public void startScreen(){
        frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
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
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
        //TextArea ta = new JTextArea();

        //Middle
        /*
        JPanel middle = new JPanel();
        JLabel header = new JLabel("Breakpoint");
        header.setFont(new Font("Times", Font.BOLD, 20));
        middle.add(header);

        JTextArea description = new JTextArea("Welcome to our humble abode. I hope you have a good time here and gets lots of work done. Select preferences below.");
        description.setLineWrap(true);
        middle.add(description);*/

        JLabel middle = new JLabel(
                "<html>" +
                        "<div style = \"background-color: #ADD8E6; margin: 20px\">" +
                        "<h1 style = \"text-align: center\">" +
                        "Breakpoint" +
                        "</h1>" +
                        "<div style = \"text-align: center; padding: 10px 30px\">" +
                        "Welcome to our humble abode. I hope you have a good time here and gets lots of work done. Select preferences below." +
                        "</div>" +
                        "</div>" +
                        "</html>");

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, middle);
        frame.setVisible(true);
    }
}
